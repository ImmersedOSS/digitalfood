package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food_nutrient_conversion_factor.csv. */
@FreeBuilder
public interface FoodNutrientConversionFactor {
  int id();

  int fdcId();

  class Builder extends FoodNutrientConversionFactor_Builder implements FoodDataBuilder<Builder, FoodNutrientConversionFactor> {
    @Override
    public Builder fromCsv(String[] row) {
      super.id(Integer.parseInt(row[0]));
      super.fdcId(Integer.parseInt(row[1]));
      return this;
    }
  }
}
