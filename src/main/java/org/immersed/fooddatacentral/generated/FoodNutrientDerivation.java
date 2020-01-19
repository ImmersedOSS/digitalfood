package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food_nutrient_derivation.csv. */
@FreeBuilder
interface FoodNutrientDerivation {
  int id();

  String code();

  String description();

  int sourceId();

  class Builder extends FoodNutrientDerivation_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      super.id(Integer.parseInt(row[0]));
      super.code(row[1]);
      super.description(row[2]);
      super.sourceId(Integer.parseInt(row[3]));
      return this;
    }
  }
}
