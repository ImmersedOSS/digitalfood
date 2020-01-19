package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from sr_legacy_food.csv. */
@FreeBuilder
interface SrLegacyFood {
  int fdcId();

  int ndbNumber();

  class Builder extends SrLegacyFood_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
