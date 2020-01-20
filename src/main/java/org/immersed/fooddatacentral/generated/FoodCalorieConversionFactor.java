package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.util.OptionalDouble;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food_calorie_conversion_factor.csv. */
@FreeBuilder
public interface FoodCalorieConversionFactor {
  int foodNutrientConversionFactorId();

  OptionalDouble proteinValue();

  OptionalDouble fatValue();

  OptionalDouble carbohydrateValue();

  class Builder extends FoodCalorieConversionFactor_Builder implements FoodDataBuilder<Builder, FoodCalorieConversionFactor> {
    @Override
    public Builder fromCsv(String[] row) {
      super.foodNutrientConversionFactorId(Integer.parseInt(row[0]));
      super.proteinValue(org.immersed.fooddatacentral.OptionalSupport.parseDouble(row[1]));
      super.fatValue(org.immersed.fooddatacentral.OptionalSupport.parseDouble(row[2]));
      super.carbohydrateValue(org.immersed.fooddatacentral.OptionalSupport.parseDouble(row[3]));
      return this;
    }
  }
}
