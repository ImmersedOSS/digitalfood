package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from input_food.csv. */
@FreeBuilder
interface InputFood {
  OptionalInt id();

  OptionalInt fdcId();

  OptionalInt fdcIdOfInputFood();

  OptionalInt seqNum();

  OptionalDouble amount();

  OptionalInt srCode();

  String srDescription();

  String unit();

  OptionalInt portionCode();

  String portionDescription();

  OptionalDouble gramWeight();

  OptionalInt retentionCode();

  OptionalInt surveyFlag();

  class Builder extends InputFood_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
