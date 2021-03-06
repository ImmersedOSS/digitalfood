package org.immersed.fooddatacentral;

import static com.google.common.base.CaseFormat.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

import javax.lang.model.element.Modifier;

import org.immersed.Constants;
import org.inferred.freebuilder.FreeBuilder;

import com.google.common.base.Preconditions;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import com.univocity.parsers.common.ParsingContext;
import com.univocity.parsers.common.processor.RowProcessor;

public class DataObjectGeneratorRowProcessor implements RowProcessor
{
    private static final Map<TypeName, String> TYPES = new HashMap<>();

    static
    {
        TYPES.put(TypeName.BOOLEAN, "\"Y\".equals");
        TYPES.put(TypeName.INT, "Integer.parseInt");
        TYPES.put(TypeName.LONG, "Long.parseLong");
        TYPES.put(TypeName.DOUBLE, "Double.parseDouble");
        TYPES.put(TypeName.get(LocalDate.class), "LocalDate.parse");
        TYPES.put(TypeName.get(OptionalInt.class), "org.immersed.fooddatacentral.OptionalSupport.parseInt");
        TYPES.put(TypeName.get(OptionalLong.class), "org.immersed.fooddatacentral.OptionalSupport.parseLong");
        TYPES.put(TypeName.get(OptionalDouble.class), "org.immersed.fooddatacentral.OptionalSupport.parseDouble");
    }

    private TypeSpec.Builder dataObjectType;
    private TypeSpec.Builder builderType;
    private MethodSpec.Builder builderCsvMethod;

    private DataObjectReturnTypeGuesser[] guessers;

    public DataObjectGeneratorRowProcessor(String fileName)
    {
        String name = fileName.replace(".csv", "");

        String typeName = LOWER_UNDERSCORE.to(UPPER_CAMEL, name);
        String generatedPackage = Constants.generated(Constants.PACKAGE);
        ClassName rawType = ClassName.get(FoodDataBuilder.class);

        TypeName builderClass = ClassName.get(generatedPackage, typeName, "Builder");
        TypeName dataClass = ClassName.get(generatedPackage, typeName);
        TypeName superInterface = ParameterizedTypeName.get(rawType, builderClass, dataClass);

        this.builderCsvMethod = MethodSpec.methodBuilder("fromCsv")
                                          .addAnnotation(Override.class)
                                          .addModifiers(Modifier.PUBLIC)
                                          .addParameter(ParameterSpec.builder(String[].class, "row")
                                                                     .build())
                                          .returns(builderClass);

        this.builderType = TypeSpec.classBuilder("Builder")
                                   .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                                   .superclass(ClassName.get(generatedPackage, typeName + "_Builder"))
                                   .addSuperinterface(superInterface);

        this.dataObjectType = TypeSpec.interfaceBuilder(typeName)
                                      .addModifiers(Modifier.PUBLIC)
                                      .addAnnotation(FreeBuilder.class)
                                      .addJavadoc("Auto-generated from $L.", fileName);
    }

    @Override
    public void processStarted(ParsingContext context)
    {
        // NO_OP
    }

    @Override
    public void rowProcessed(String[] row, ParsingContext context)
    {
        if (Arrays.equals(context.headers(), row))
        {
            this.guessers = new DataObjectReturnTypeGuesser[row.length];
            Arrays.setAll(this.guessers, i -> new DataObjectReturnTypeGuesser());
        }
        else
        {
            Preconditions.checkState(row.length == context.headers().length);

            for (int i = 0; i < row.length; i++)
            {
                this.guessers[i].updateState(row[i]);
            }
        }
    }

    @Override
    public void processEnded(ParsingContext context)
    {
        String[] columns = context.headers();

        for (int i = 0; i < columns.length; i++)
        {
            String methodName = LOWER_UNDERSCORE.to(LOWER_CAMEL, columns[i]);

            TypeName type = this.guessers[i].bestMatch();
            MethodSpec method = MethodSpec.methodBuilder(methodName)
                                          .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                                          .returns(type)
                                          .build();
            this.dataObjectType.addMethod(method);

            TypeName workingType = type;
            CodeBlock.Builder block = CodeBlock.builder();
            block.add("super.$L(", methodName);
            int calls = 1;

            if (workingType instanceof ParameterizedTypeName)
            {
                workingType = ((ParameterizedTypeName) type).typeArguments.get(0);

                block.add("Optional.ofNullable(");
                calls++;
            }

            if (TYPES.containsKey(workingType))
            {
                block.add("$L(", TYPES.get(workingType));
                calls++;
            }

            block.add("row[$L]", i);

            for (int x = 0; x < calls; x++)
            {
                block.add(")");
            }
            block.add(";\n");
            this.builderCsvMethod.addCode(block.build());
        }

        this.builderCsvMethod.addStatement("return this");

        this.builderType.addMethod(this.builderCsvMethod.build());

        this.dataObjectType.addType(builderType.build());
    }

    public TypeSpec getBuilderType()
    {
        return builderType.build();
    }

    public TypeSpec getDataObjectType()
    {
        return dataObjectType.build();
    }

    public void saveToDisk() throws IOException
    {
        String generatedPackage = Constants.generated(Constants.PACKAGE);
        JavaFile.builder(generatedPackage, dataObjectType.build())
                .build()
                .writeTo(Constants.SOURCE_FOLDER);
    }
}
