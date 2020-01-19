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

  String dataPoints();

  String derivationId();

  String min();

  String max();

  String median();

  String footnote();

  String minYearAcquired();
}
