package org.immersed.fooddatacentral;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import javax.lang.model.element.Modifier;

import org.immersed.Constants;

import com.google.common.base.CaseFormat;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;

public class DatasetsGenerator
{
    private TypeSpec.Builder datasetsType;

    public DatasetsGenerator()
    {
        MethodSpec constructor = MethodSpec.constructorBuilder()
                                           .addModifiers(Modifier.PRIVATE)
                                           .build();

        this.datasetsType = TypeSpec.classBuilder("Datasets")
                                    .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
                                    .addMethod(constructor);
    }

    public void saveToDisk() throws IOException
    {
        String generatedPackage = Constants.generated(Constants.PACKAGE);
        JavaFile.builder(generatedPackage, datasetsType.build())
                .build()
                .writeTo(Constants.SOURCE_FOLDER);
    }

    public void add(String nameOfFileInZip, DataObjectGeneratorRowProcessor processor)
    {
        TypeSpec dataObject = processor.getDataObjectType();
        ClassName rawType = ClassName.get(List.class);
        TypeName typeArgument = ClassName.get(Constants.generated(Constants.PACKAGE), dataObject.name);
        ParameterizedTypeName typeName = ParameterizedTypeName.get(rawType, typeArgument);

        String fieldName = CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, dataObject.name) + "_LIST";

        FieldSpec constant = FieldSpec.builder(typeName, fieldName, Modifier.STATIC, Modifier.PUBLIC, Modifier.FINAL)
                                      .initializer("$T.emptyList()", Collections.class)
                                      .build();

        this.datasetsType.addField(constant);
    }
}
