package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food_calorie_conversion_factor.csv. */
@FreeBuilder
interface FoodCalorieConversionFactor {
  int foodNutrientConversionFactorId();

  double proteinValue();

  double fatValue();

  double carbohydrateValue();

  class Builder extends FoodCalorieConversionFactor_Builder implements FoodDataBuilder<Builder, FoodCalorieConversionFactor> {
    @Override
    public Builder fromCsv(String[] row) {
      super.foodNutrientConversionFactorId(Integer.parseInt(row[0]));
      super.proteinValue(Double.parseDouble(row[1]));
      super.fatValue(Double.parseDouble(row[2]));
      super.carbohydrateValue(Double.parseDouble(row[3]));
      return this;
    }
  }
}
