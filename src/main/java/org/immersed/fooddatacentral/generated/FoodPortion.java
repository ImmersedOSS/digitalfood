package org.immersed.fooddatacentral.generated;

import java.lang.String;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food_portion.csv. */
@FreeBuilder
interface FoodPortion {
  int id();

  int fdcId();

  String seqNum();

  String amount();

  int measureUnitId();

  String portionDescription();

  String modifier();

  double gramWeight();

  String dataPoints();

  String footnote();

  String minYearAcquired();
}