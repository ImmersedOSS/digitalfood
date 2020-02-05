package org.immersed.fooddatacentral;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import javax.lang.model.element.Modifier;

import org.immersed.Constants;

import com.google.common.base.CaseFormat;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;

public class DatasetsGenerator
{
    private TypeSpec.Builder datasetsType;
    private CodeBlock.Builder initializer;

    public DatasetsGenerator()
    {
        MethodSpec constructor = MethodSpec.constructorBuilder()
                                           .addModifiers(Modifier.PRIVATE)
                                           .build();

        this.datasetsType = TypeSpec.classBuilder("Datasets")
                                    .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
                                    .addMethod(constructor);

        this.initializer = CodeBlock.builder()
                                    .add("try ($T zipFile = $T.load())\n", ZipFile.class, ZipLoader.class)
                                    .add("{\n")
                                    .indent();
    }

    public void saveToDisk() throws IOException
    {
        this.initializer.unindent()
                        .add("}\n")
                        .add("catch($T e)", IOException.class)
                        .add("{\n")
                        .indent()
                        .addStatement("throw new $T(e)", IllegalStateException.class)
                        .unindent()
                        .add("}\n");

        this.datasetsType.addStaticBlock(this.initializer.build());

        String generatedPackage = Constants.generated(Constants.PACKAGE);
        JavaFile.builder(generatedPackage, datasetsType.build())
                .build()
                .writeTo(Constants.SOURCE_FOLDER);
    }

    public void add(String nameOfFileInZip, DataObjectGeneratorRowProcessor processor)
    {
        // create field
        TypeSpec dataObject = processor.getDataObjectType();
        ClassName rawType = ClassName.get(List.class);
        TypeName typeArgument = ClassName.get(Constants.generated(Constants.PACKAGE), dataObject.name);
        ParameterizedTypeName typeName = ParameterizedTypeName.get(rawType, typeArgument);

        String fieldName = CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, dataObject.name) + "_LIST";

        FieldSpec constant = FieldSpec.builder(typeName, fieldName, Modifier.STATIC, Modifier.PRIVATE, Modifier.FINAL)
                                      .build();

        this.datasetsType.addField(constant);

        // load data
        String zipEntryName = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, dataObject.name);
        this.initializer.addStatement("$T $L = zipFile.getEntry(\"$L\")", ZipEntry.class, zipEntryName, nameOfFileInZip)
                        .addStatement("$L = new $T<>(new $T.Builder(), zipFile.getInputStream($L)).getData()",
                                fieldName, CsvDataset.class, typeArgument, zipEntryName);

        // static getter method
        String staticMethodName = zipEntryName.endsWith("y")
                ? zipEntryName.substring(0, zipEntryName.length() - 1) + "ies"
                : zipEntryName + "s";

        this.datasetsType.addMethod(MethodSpec.methodBuilder(staticMethodName)
                                              .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                                              .returns(typeName)
                                              .addStatement("return $T.unmodifiableList($L)", Collections.class,
                                                      fieldName)
                                              .build());
    }
}
