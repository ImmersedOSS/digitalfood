package org.immersed.fooddatacentral;

import static com.google.common.base.CaseFormat.*;

import java.io.*;
import java.util.*;

import javax.lang.model.element.*;

import org.immersed.*;
import org.inferred.freebuilder.*;

import com.google.common.base.*;
import com.squareup.javapoet.*;
import com.univocity.parsers.common.*;
import com.univocity.parsers.common.processor.*;

public class JavaPoetRowProcessor implements RowProcessor
{
    private TypeSpec.Builder dataObjectType;
    private TypeSpec.Builder builderType;
    private MethodSpec.Builder builderCsvMethod;

    private ReturnTypeGuesser[] guessers;

    public JavaPoetRowProcessor(String fileName)
    {
        String name = fileName.replace(".csv", "");

        String typeName = LOWER_UNDERSCORE.to(UPPER_CAMEL, name);
        String generatedPackage = Constants.generated(Constants.PACKAGE);
        ClassName rawType = ClassName.get(FoodDataBuilder.class);

        TypeName builderClass = ClassName.get(generatedPackage, typeName, "Builder");
        TypeName superInterface = ParameterizedTypeName.get(rawType, builderClass);

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
            this.guessers = new ReturnTypeGuesser[row.length];
            Arrays.setAll(this.guessers, i -> new ReturnTypeGuesser());
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

            MethodSpec method = MethodSpec.methodBuilder(methodName)
                                          .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                                          .returns(this.guessers[i].bestMatch())
                                          .build();
            this.dataObjectType.addMethod(method);
        }

        this.builderCsvMethod.addStatement("return this");

        this.builderType.addMethod(this.builderCsvMethod.build());

        this.dataObjectType.addType(builderType.build());
    }

    public void saveToDisk() throws IOException
    {
        String generatedPackage = Constants.generated(Constants.PACKAGE);
        JavaFile.builder(generatedPackage, dataObjectType.build())
                .build()
                .writeTo(Constants.SOURCE_FOLDER);
    }
}
