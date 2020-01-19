package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.util.OptionalInt;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from nutrient_incoming_name.csv. */
@FreeBuilder
interface NutrientIncomingName {
  OptionalInt id();

  String name();

  OptionalInt nutrientId();

  class Builder extends NutrientIncomingName_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
