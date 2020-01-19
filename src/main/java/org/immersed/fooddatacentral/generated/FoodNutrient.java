package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food_nutrient.csv. */
@FreeBuilder
interface FoodNutrient {
  OptionalInt id();

  OptionalInt fdcId();

  OptionalInt nutrientId();

  OptionalDouble amount();

  OptionalInt dataPoints();

  OptionalInt derivationId();

  OptionalDouble min();

  OptionalDouble max();

  OptionalDouble median();

  String footnote();

  OptionalInt minYearAcquired();

  class Builder extends FoodNutrient_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
