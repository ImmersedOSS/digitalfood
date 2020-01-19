package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from sample_food.csv. */
@FreeBuilder
interface SampleFood {
  int fdcId();

  class Builder extends SampleFood_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      super.fdcId(Integer.parseInt(row[0]));
      return this;
    }
  }
}
