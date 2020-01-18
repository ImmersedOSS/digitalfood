package org.immersed.fooddatacentral;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.immersed.Constants;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;

public class DataObjectGenerator
{
    public static void main(String[] args) throws IOException
    {
        Path home = Files.createDirectories(Constants.HOME);

        Path zip = Files.walk(home, 1)
                        .filter(p ->
                        {
                            String name = p.toString();

                            boolean isZip = name.endsWith(".zip");
                            boolean isFoodData = name.contains("FoodData_Central_csv");
                            return isZip && isFoodData;
                        })
                        .findAny()
                        .orElseThrow(() -> new IllegalStateException("No data zip found."));

        try (ZipFile file = new ZipFile(zip.toFile()))
        {
            for (ZipEntry entry : Collections.list(file.entries()))
            {
                readFile(file, entry);
            }
        }
    }

    private static final void readFile(ZipFile file, ZipEntry entry) throws IOException
    {
        String nameOfFileInZip = entry.getName();

        if (nameOfFileInZip.endsWith(".csv"))
        {
            TypeSpec typeSpec = TypeSpec.interfaceBuilder(convert(nameOfFileInZip))
                                        .addJavadoc("Auto-generated from $L.", nameOfFileInZip)
                                        .build();

            InputStream stream = file.getInputStream(entry);
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream)))
            {

            }

            JavaFile.builder("org.immersed.fooddatacentral.generated", typeSpec)
                    .build()
                    .writeTo(Paths.get("src", "main", "java"));
        }
    }

    private static final String convert(String fileName)
    {
        String name = fileName.replace(".csv", "");

        StringBuilder builder = new StringBuilder();

        boolean upper = true;
        for (int i = 0; i < name.length(); i++)
        {
            char value = name.charAt(i);

            if (upper)
            {
                value = Character.toUpperCase(value);
                upper = false;
            }

            if (value == '_')
            {
                upper = true;
            }
            else
            {
                builder.append(value);
            }
        }

        return builder.toString();
    }
}
