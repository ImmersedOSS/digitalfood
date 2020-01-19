package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from sub_sample_result.csv. */
@FreeBuilder
interface SubSampleResult {
  int foodNutrientId();

  double adjustedAmount();

  int labMethodId();

  String nutrientName();

  class Builder extends SubSampleResult_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
