package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food_protein_conversion_factor.csv. */
@FreeBuilder
interface FoodProteinConversionFactor {
  int foodNutrientConversionFactorId();

  double value();

  class Builder extends FoodProteinConversionFactor_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
