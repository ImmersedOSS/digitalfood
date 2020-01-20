package org.immersed.fooddatacentral;

import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.immersed.fooddatacentral.generated.Food;

public class CsvLoadingApplication
{
    public static void main(String[] args) throws IOException
    {
        try (ZipFile file = ZipLoader.load())
        {
            ZipEntry entry = file.getEntry("food.csv");
            CsvDataset<Food.Builder, Food> dataset = new CsvDataset<>(new Food.Builder(), file.getInputStream(entry));

            System.out.println(dataset.getData()
                                      .size());
        }
    }
}
