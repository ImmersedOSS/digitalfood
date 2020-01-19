package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food_nutrient.csv. */
@FreeBuilder
public interface FoodNutrient {
  int id();

  int fdcId();

  int nutrientId();

  double amount();

  int dataPoints();

  int derivationId();

  double min();

  double max();

  double median();

  String footnote();

  int minYearAcquired();

  class Builder extends FoodNutrient_Builder implements FoodDataBuilder<Builder, FoodNutrient> {
    @Override
    public Builder fromCsv(String[] row) {
      super.id(Integer.parseInt(row[0]));
      super.fdcId(Integer.parseInt(row[1]));
      super.nutrientId(Integer.parseInt(row[2]));
      super.amount(Double.parseDouble(row[3]));
      super.dataPoints(Integer.parseInt(row[4]));
      super.derivationId(Integer.parseInt(row[5]));
      super.min(Double.parseDouble(row[6]));
      super.max(Double.parseDouble(row[7]));
      super.median(Double.parseDouble(row[8]));
      super.footnote(row[9]);
      super.minYearAcquired(Integer.parseInt(row[10]));
      return this;
    }
  }
}
