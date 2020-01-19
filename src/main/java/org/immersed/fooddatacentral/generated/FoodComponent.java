package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food_component.csv. */
@FreeBuilder
interface FoodComponent {
  int id();

  int fdcId();

  String name();

  double pctWeight();

  boolean isRefuse();

  double gramWeight();

  int dataPoints();

  int minYearAcquired();

  class Builder extends FoodComponent_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      super.id(Integer.parseInt(row[0]));
      super.fdcId(Integer.parseInt(row[1]));
      super.name(row[2]);
      super.pctWeight(Double.parseDouble(row[3]));
      super.isRefuse("Y".equals(row[4]));
      super.gramWeight(Double.parseDouble(row[5]));
      super.dataPoints(Integer.parseInt(row[6]));
      super.minYearAcquired(Integer.parseInt(row[7]));
      return this;
    }
  }
}
