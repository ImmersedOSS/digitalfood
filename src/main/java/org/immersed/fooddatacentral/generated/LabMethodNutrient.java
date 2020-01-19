package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.util.OptionalInt;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from lab_method_nutrient.csv. */
@FreeBuilder
interface LabMethodNutrient {
  OptionalInt id();

  OptionalInt labMethodId();

  OptionalInt nutrientId();

  class Builder extends LabMethodNutrient_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
