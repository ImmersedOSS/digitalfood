package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.util.OptionalInt;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food_nutrient_derivation.csv. */
@FreeBuilder
interface FoodNutrientDerivation {
  OptionalInt id();

  String code();

  String description();

  OptionalInt sourceId();

  class Builder extends FoodNutrientDerivation_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
