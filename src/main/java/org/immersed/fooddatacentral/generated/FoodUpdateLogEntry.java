package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food_update_log_entry.csv. */
@FreeBuilder
interface FoodUpdateLogEntry {
  int id();

  String description();

  LocalDate lastUpdated();

  class Builder extends FoodUpdateLogEntry_Builder implements FoodDataBuilder<Builder, FoodUpdateLogEntry> {
    @Override
    public Builder fromCsv(String[] row) {
      super.id(Integer.parseInt(row[0]));
      super.description(row[1]);
      super.lastUpdated(LocalDate.parse(row[2]));
      return this;
    }
  }
}
