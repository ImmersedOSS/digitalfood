package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from lab_method_nutrient.csv. */
@FreeBuilder
public interface LabMethodNutrient {
  int id();

  int labMethodId();

  int nutrientId();

  class Builder extends LabMethodNutrient_Builder implements FoodDataBuilder<Builder, LabMethodNutrient> {
    @Override
    public Builder fromCsv(String[] row) {
      super.id(Integer.parseInt(row[0]));
      super.labMethodId(Integer.parseInt(row[1]));
      super.nutrientId(Integer.parseInt(row[2]));
      return this;
    }
  }
}
