package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from lab_method_nutrient.csv. */
@FreeBuilder
interface LabMethodNutrient {
  int id();

  int labMethodId();

  int nutrientId();

  class Builder extends LabMethodNutrient_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
