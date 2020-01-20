package org.immersed.fooddatacentral;

import static org.immersed.Constants.*;

import java.io.*;
import java.nio.file.*;
import java.util.stream.*;
import java.util.zip.*;

import org.immersed.*;

public final class ZipLoader
{
    public static ZipFile load() throws IOException
    {
        Path home = Files.createDirectories(Constants.HOME);

        try (Stream<Path> stream = Files.walk(home, 1))
        {
            Path zip = stream.filter(p ->
            {
                String name = p.toString();

                boolean isZip = name.endsWith(".zip");
                boolean isFoodData = name.contains("FoodData_Central_csv");
                return isZip && isFoodData;
            })
                             .findAny()
                             .orElseThrow(() -> new IllegalStateException("No data zip found."));

            return new ZipFile(zip.toFile());
        }
    }

    private ZipLoader()
    {
    }
}
