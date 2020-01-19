package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.util.OptionalInt;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from foundation_food.csv. */
@FreeBuilder
interface FoundationFood {
  OptionalInt fdcId();

  OptionalInt ndbNumber();

  String footnote();

  class Builder extends FoundationFood_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
