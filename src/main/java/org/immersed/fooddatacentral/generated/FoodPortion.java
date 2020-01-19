package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food_portion.csv. */
@FreeBuilder
interface FoodPortion {
  OptionalInt id();

  OptionalInt fdcId();

  OptionalInt seqNum();

  OptionalDouble amount();

  OptionalInt measureUnitId();

  String portionDescription();

  String modifier();

  OptionalDouble gramWeight();

  OptionalInt dataPoints();

  Optional<String> footnote();

  OptionalInt minYearAcquired();

  class Builder extends FoodPortion_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
