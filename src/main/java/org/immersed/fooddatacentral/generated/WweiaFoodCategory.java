package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from wweia_food_category.csv. */
@FreeBuilder
public interface WweiaFoodCategory {
  int wweiaFoodCategoryCode();

  String wweiaFoodCategoryDescription();

  class Builder extends WweiaFoodCategory_Builder implements FoodDataBuilder<Builder, WweiaFoodCategory> {
    @Override
    public Builder fromCsv(String[] row) {
      super.wweiaFoodCategoryCode(Integer.parseInt(row[0]));
      super.wweiaFoodCategoryDescription(row[1]);
      return this;
    }
  }
}
