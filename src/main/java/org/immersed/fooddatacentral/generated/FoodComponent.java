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
      return this;
    }
  }
}
