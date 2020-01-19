package org.immersed.fooddatacentral.generated;

import java.lang.String;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food_component.csv. */
@FreeBuilder
interface FoodComponent {
  int id();

  int fdcId();

  String name();

  double pctWeight();

  String isRefuse();

  double gramWeight();

  int dataPoints();

  int minYearAcquired();
}
