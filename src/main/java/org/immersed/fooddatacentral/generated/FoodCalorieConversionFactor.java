package org.immersed.fooddatacentral.generated;

import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food_calorie_conversion_factor.csv. */
@FreeBuilder
interface FoodCalorieConversionFactor {
  int foodNutrientConversionFactorId();

  double proteinValue();

  double fatValue();

  double carbohydrateValue();

  class Builder extends FoodCalorieConversionFactor_Builder {
  }
}
