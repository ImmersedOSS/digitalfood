package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from measure_unit.csv. */
@FreeBuilder
interface MeasureUnit {
  int id();

  String name();

  class Builder extends MeasureUnit_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      super.id(Integer.parseInt(row[0]));
      super.name(row[1]);
      return this;
    }
  }
}
