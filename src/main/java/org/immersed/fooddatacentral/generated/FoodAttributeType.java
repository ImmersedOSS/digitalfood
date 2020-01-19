package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food_attribute_type.csv. */
@FreeBuilder
interface FoodAttributeType {
  int id();

  String name();

  String description();

  class Builder extends FoodAttributeType_Builder implements FoodDataBuilder<Builder, FoodAttributeType> {
    @Override
    public Builder fromCsv(String[] row) {
      super.id(Integer.parseInt(row[0]));
      super.name(row[1]);
      super.description(row[2]);
      return this;
    }
  }
}
