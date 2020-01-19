package org.immersed.fooddatacentral;

import java.io.*;
import java.util.*;
import java.util.zip.*;

import com.univocity.parsers.csv.*;

public class DataObjectGenerator
{
    public static void main(String[] args) throws IOException
    {
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
