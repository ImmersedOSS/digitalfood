package org.immersed.fooddatacentral;

import org.immersed.fooddatacentral.generated.Datasets;
import org.immersed.fooddatacentral.generated.FoodNutrient;
import org.immersed.fooddatacentral.generated.Nutrient;

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

        System.out.println();

        Datasets.foodNutrients()
                .stream()
                .filter(f -> f.fdcId() == 168409)
                .forEach(CsvLoadingApplication::printNutrients);
    }

    public static void printNutrients(FoodNutrient foodNutrient)
    {
        Nutrient nutrient = Datasets.nutrients()
                                    .stream()
                                    .filter(n -> n.id() == foodNutrient.nutrientId())
                                    .findFirst()
                                    .orElseThrow(() -> new IllegalStateException("Unknown nutrient: " + foodNutrient));

        String line = String.format("  %s: %.2f", nutrient.name(), foodNutrient.amount());
        System.out.println(line);
    }
}
