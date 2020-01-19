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

  class Builder extends FoodProteinConversionFactor_Builder implements FoodDataBuilder<Builder, FoodProteinConversionFactor> {
    @Override
    public Builder fromCsv(String[] row) {
      super.foodNutrientConversionFactorId(Integer.parseInt(row[0]));
      super.value(Double.parseDouble(row[1]));
      return this;
    }
  }
}
