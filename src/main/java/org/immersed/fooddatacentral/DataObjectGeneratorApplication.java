package org.immersed.fooddatacentral;

import static org.immersed.Constants.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.immersed.Constants;

import com.univocity.parsers.csv.Csv;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;

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
                          throw new IllegalStateException(e);
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
            DataObjectGeneratorRowProcessor processor = new DataObjectGeneratorRowProcessor(nameOfFileInZip);

            CsvParserSettings settings = Csv.parseRfc4180();
            settings.setProcessor(processor);

            System.out.println(nameOfFileInZip);
            CsvParser parser = new CsvParser(settings);
            parser.parse(file.getInputStream(entry));

            processor.saveToDisk();
        }
    }
}
