package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food_attribute.csv. */
@FreeBuilder
interface FoodAttribute {
  int id();

  int fdcId();

  int seqNum();

  int foodAttributeTypeId();

  String name();

  String value();

  class Builder extends FoodAttribute_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
