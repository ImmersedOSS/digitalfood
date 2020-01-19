package org.immersed.fooddatacentral;

import static com.google.common.base.CaseFormat.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;

import javax.lang.model.element.*;

import org.inferred.freebuilder.*;

import com.google.common.base.*;
import com.squareup.javapoet.*;
import com.univocity.parsers.common.*;
import com.univocity.parsers.common.processor.*;

public class JavaPoetRowProcessor implements RowProcessor
{
    private TypeSpec.Builder builder;
    private ReturnTypeGuesser[] guessers;

    public JavaPoetRowProcessor(String fileName)
    {
        String name = fileName.replace(".csv", "");
        this.builder = TypeSpec.interfaceBuilder(LOWER_UNDERSCORE.to(UPPER_CAMEL, name))
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

                if (context.headers()[i].equals("available_date"))
                {
                    if (String.class.equals(this.guessers[i].bestMatch()))
                    {
                        System.out.println();
                    }
                }
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
            this.builder.addMethod(method);
        }
    }

    public void saveToDisk() throws IOException
    {
        JavaFile.builder("org.immersed.fooddatacentral.generated", builder.build())
                .build()
                .writeTo(Paths.get("src", "main", "java"));
    }
}
