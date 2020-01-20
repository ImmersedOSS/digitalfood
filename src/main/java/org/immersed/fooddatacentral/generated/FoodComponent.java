package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food_component.csv. */
@FreeBuilder
public interface FoodComponent {
  int id();

  int fdcId();

  String name();

  OptionalDouble pctWeight();

  boolean isRefuse();

  double gramWeight();

  int dataPoints();

  OptionalInt minYearAcquired();

  class Builder extends FoodComponent_Builder implements FoodDataBuilder<Builder, FoodComponent> {
    @Override
    public Builder fromCsv(String[] row) {
      super.id(Integer.parseInt(row[0]));
      super.fdcId(Integer.parseInt(row[1]));
      super.name(row[2]);
      super.pctWeight(org.immersed.fooddatacentral.OptionalSupport.parseDouble(row[3]));
      super.isRefuse("Y".equals(row[4]));
      super.gramWeight(Double.parseDouble(row[5]));
      super.dataPoints(Integer.parseInt(row[6]));
      super.minYearAcquired(org.immersed.fooddatacentral.OptionalSupport.parseInt(row[7]));
      return this;
    }
  }
}
