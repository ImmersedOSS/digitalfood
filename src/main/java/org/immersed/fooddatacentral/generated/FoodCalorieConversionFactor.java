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

  class Builder extends FoodCalorieConversionFactor_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
