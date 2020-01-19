package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from lab_method.csv. */
@FreeBuilder
interface LabMethod {
  int id();

  String description();

  String technique();

  class Builder extends LabMethod_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      super.id(Integer.parseInt(row[0]));
      super.description(row[1]);
      super.technique(row[2]);
      return this;
    }
  }
}
