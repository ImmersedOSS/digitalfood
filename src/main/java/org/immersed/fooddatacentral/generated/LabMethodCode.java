package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from lab_method_code.csv. */
@FreeBuilder
interface LabMethodCode {
  int id();

  int labMethodId();

  String code();

  class Builder extends LabMethodCode_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
