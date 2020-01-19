package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from nutrient.csv. */
@FreeBuilder
interface Nutrient {
  int id();

  String name();

  String unitName();

  double nutrientNbr();

  int rank();

  class Builder extends Nutrient_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      super.id(Integer.parseInt(row[0]));
      super.name(row[1]);
      super.unitName(row[2]);
      super.nutrientNbr(Double.parseDouble(row[3]));
      super.rank(Integer.parseInt(row[4]));
      return this;
    }
  }
}
