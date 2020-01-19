package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.util.OptionalInt;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from wweia_food_category.csv. */
@FreeBuilder
interface WweiaFoodCategory {
  OptionalInt wweiaFoodCategoryCode();

  String wweiaFoodCategoryDescription();

  class Builder extends WweiaFoodCategory_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
