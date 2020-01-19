package org.immersed.fooddatacentral.generated;

import java.lang.String;
import java.util.Optional;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food_portion.csv. */
@FreeBuilder
interface FoodPortion {
  int id();

  int fdcId();

  int seqNum();

  double amount();

  int measureUnitId();

  String portionDescription();

  String modifier();

  double gramWeight();

  int dataPoints();

  Optional<String> footnote();

  int minYearAcquired();

  class Builder extends FoodPortion_Builder {
  }
}
