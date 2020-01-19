package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from nutrient_incoming_name.csv. */
@FreeBuilder
interface NutrientIncomingName {
  int id();

  String name();

  int nutrientId();

  class Builder extends NutrientIncomingName_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      super.id(Integer.parseInt(row[0]));
      super.name(row[1]);
      super.nutrientId(Integer.parseInt(row[2]));
      return this;
    }
  }
}
