package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from sub_sample_food.csv. */
@FreeBuilder
interface SubSampleFood {
  int fdcId();

  int fdcIdOfSampleFood();

  class Builder extends SubSampleFood_Builder implements FoodDataBuilder<Builder, SubSampleFood> {
    @Override
    public Builder fromCsv(String[] row) {
      super.fdcId(Integer.parseInt(row[0]));
      super.fdcIdOfSampleFood(Integer.parseInt(row[1]));
      return this;
    }
  }
}
