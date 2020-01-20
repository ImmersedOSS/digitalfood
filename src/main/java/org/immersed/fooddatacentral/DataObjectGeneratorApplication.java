package org.immersed.fooddatacentral;

import static org.immersed.Constants.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Stream;
import java.util.zip.*;

import org.immersed.Constants;

import com.univocity.parsers.csv.*;

public class DataObjectGeneratorApplication
{
    public static void main(String[] args) throws IOException
    {
        Path pathToClear = resolve(SOURCE_FOLDER, generated(Constants.PACKAGE));
        try (Stream<Path> stream = Files.walk(pathToClear))
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

        try (ZipFile file = ZipLoader.load())
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
