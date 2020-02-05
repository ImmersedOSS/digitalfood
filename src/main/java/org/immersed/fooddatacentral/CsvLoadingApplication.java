package org.immersed.fooddatacentral;

import org.immersed.fooddatacentral.generated.Datasets;

public class CsvLoadingApplication
{
    public static void main(String[] args)
    {
        Datasets.foods()
                .stream()
                .filter(f -> f.description()
                              .toLowerCase()
                              .contains("cucumber"))
                .sorted((f1, f2) -> f1.description()
                                      .toLowerCase()
                                      .compareTo(f2.description()
                                                   .toLowerCase()))
                .forEach(System.out::println);
    }
}
