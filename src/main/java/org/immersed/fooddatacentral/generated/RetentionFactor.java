package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.util.OptionalInt;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from retention_factor.csv. */
@FreeBuilder
interface RetentionFactor {
  OptionalInt id();

  OptionalInt code();

  OptionalInt foodGroupId();

  String description();

  class Builder extends RetentionFactor_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
