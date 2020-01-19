package org.immersed.fooddatacentral;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;
import java.util.zip.*;

import org.immersed.*;

import com.univocity.parsers.csv.*;

public class DataObjectGenerator
{
    public static void main(String[] args) throws IOException
    {
        Path home = Files.createDirectories(Constants.HOME);

        try (Stream<Path> stream = Files.walk(
                Paths.get("src", "main", "java", "org", "immersed", "fooddatacentral", "generated")))
        {
            stream.filter(Files::isRegularFile)
                  .forEach(file ->
                  {
                      try
                      {
                          Files.delete(file);
                      }
                      catch (IOException e)
                      {
                          e.printStackTrace();
                      }
                  });
        }

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

            try (ZipFile file = new ZipFile(zip.toFile()))
            {
                for (ZipEntry entry : Collections.list(file.entries()))
                {
                    readFile(file, entry);
                }
            }
        }

    }

    private static final void readFile(ZipFile file, ZipEntry entry) throws IOException
    {
        String nameOfFileInZip = entry.getName();

        if (nameOfFileInZip.endsWith(".csv") && !nameOfFileInZip.contains("all_downloaded"))
        {
            JavaPoetRowProcessor processor = new JavaPoetRowProcessor(nameOfFileInZip);

            CsvParserSettings settings = Csv.parseRfc4180();
            settings.setProcessor(processor);

            System.out.println(nameOfFileInZip);
            CsvParser parser = new CsvParser(settings);
            parser.parse(file.getInputStream(entry));

            processor.saveToDisk();
        }
    }
}
