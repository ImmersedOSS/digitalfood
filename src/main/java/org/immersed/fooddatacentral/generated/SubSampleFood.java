package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.util.OptionalInt;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from sub_sample_food.csv. */
@FreeBuilder
interface SubSampleFood {
  OptionalInt fdcId();

  OptionalInt fdcIdOfSampleFood();

  class Builder extends SubSampleFood_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
