package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from sub_sample_result.csv. */
@FreeBuilder
public interface SubSampleResult {
  int foodNutrientId();

  OptionalDouble adjustedAmount();

  OptionalInt labMethodId();

  String nutrientName();

  class Builder extends SubSampleResult_Builder implements FoodDataBuilder<Builder, SubSampleResult> {
    @Override
    public Builder fromCsv(String[] row) {
      super.foodNutrientId(Integer.parseInt(row[0]));
      super.adjustedAmount(org.immersed.fooddatacentral.OptionalSupport.parseDouble(row[1]));
      super.labMethodId(org.immersed.fooddatacentral.OptionalSupport.parseInt(row[2]));
      super.nutrientName(row[3]);
      return this;
    }
  }
}
