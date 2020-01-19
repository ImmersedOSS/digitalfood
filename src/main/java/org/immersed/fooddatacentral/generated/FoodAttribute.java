package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.util.OptionalInt;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food_attribute.csv. */
@FreeBuilder
interface FoodAttribute {
  OptionalInt id();

  OptionalInt fdcId();

  OptionalInt seqNum();

  OptionalInt foodAttributeTypeId();

  String name();

  String value();

  class Builder extends FoodAttribute_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
