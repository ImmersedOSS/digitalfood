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
interface FoodComponent {
  OptionalInt id();

  OptionalInt fdcId();

  String name();

  OptionalDouble pctWeight();

  boolean isRefuse();

  OptionalDouble gramWeight();

  OptionalInt dataPoints();

  OptionalInt minYearAcquired();

  class Builder extends FoodComponent_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
