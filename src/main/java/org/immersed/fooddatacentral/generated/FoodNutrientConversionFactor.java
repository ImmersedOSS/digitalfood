package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.util.OptionalInt;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food_nutrient_conversion_factor.csv. */
@FreeBuilder
interface FoodNutrientConversionFactor {
  OptionalInt id();

  OptionalInt fdcId();

  class Builder extends FoodNutrientConversionFactor_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
