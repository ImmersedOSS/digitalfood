package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from retention_factor.csv. */
@FreeBuilder
interface RetentionFactor {
  int id();

  int code();

  int foodGroupId();

  String description();

  class Builder extends RetentionFactor_Builder implements FoodDataBuilder<Builder, RetentionFactor> {
    @Override
    public Builder fromCsv(String[] row) {
      super.id(Integer.parseInt(row[0]));
      super.code(Integer.parseInt(row[1]));
      super.foodGroupId(Integer.parseInt(row[2]));
      super.description(row[3]);
      return this;
    }
  }
}
