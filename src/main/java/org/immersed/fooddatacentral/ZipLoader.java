package org.immersed.fooddatacentral;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;
import java.util.zip.ZipFile;

import org.immersed.Constants;

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
