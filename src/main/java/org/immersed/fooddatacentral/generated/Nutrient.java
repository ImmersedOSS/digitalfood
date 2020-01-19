package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from nutrient.csv. */
@FreeBuilder
interface Nutrient {
  OptionalInt id();

  String name();

  String unitName();

  OptionalDouble nutrientNbr();

  OptionalInt rank();

  class Builder extends Nutrient_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
