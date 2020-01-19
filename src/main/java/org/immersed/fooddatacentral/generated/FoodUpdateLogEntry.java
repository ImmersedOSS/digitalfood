package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.util.OptionalInt;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food_update_log_entry.csv. */
@FreeBuilder
interface FoodUpdateLogEntry {
  OptionalInt id();

  String description();

  LocalDate lastUpdated();

  class Builder extends FoodUpdateLogEntry_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
