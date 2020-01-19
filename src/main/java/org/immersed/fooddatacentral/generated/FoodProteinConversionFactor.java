package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food_protein_conversion_factor.csv. */
@FreeBuilder
interface FoodProteinConversionFactor {
  OptionalInt foodNutrientConversionFactorId();

  OptionalDouble value();

  class Builder extends FoodProteinConversionFactor_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
