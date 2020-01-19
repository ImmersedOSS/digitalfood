package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food_category.csv. */
@FreeBuilder
interface FoodCategory {
  int id();

  int code();

  String description();

  class Builder extends FoodCategory_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      super.id(Integer.parseInt(row[0]));
      super.code(Integer.parseInt(row[1]));
      super.description(row[2]);
      return this;
    }
  }
}
