package org.immersed.fooddatacentral.generated;

import java.lang.String;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food_nutrient.csv. */
@FreeBuilder
interface FoodNutrient {
  int id();

  int fdcId();

  int nutrientId();

  double amount();

  int dataPoints();

  int derivationId();

  double min();

  double max();

  double median();

  String footnote();

  int minYearAcquired();
}
