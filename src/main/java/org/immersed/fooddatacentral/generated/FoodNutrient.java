package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food_nutrient.csv. */
@FreeBuilder
public interface FoodNutrient {
  int id();

  int fdcId();

  int nutrientId();

  double amount();

  OptionalInt dataPoints();

  OptionalInt derivationId();

  OptionalDouble min();

  OptionalDouble max();

  OptionalDouble median();

  Optional<String> footnote();

  OptionalInt minYearAcquired();

  class Builder extends FoodNutrient_Builder implements FoodDataBuilder<Builder, FoodNutrient> {
    @Override
    public Builder fromCsv(String[] row) {
      super.id(Integer.parseInt(row[0]));
      super.fdcId(Integer.parseInt(row[1]));
      super.nutrientId(Integer.parseInt(row[2]));
      super.amount(Double.parseDouble(row[3]));
      super.dataPoints(org.immersed.fooddatacentral.OptionalSupport.parseInt(row[4]));
      super.derivationId(org.immersed.fooddatacentral.OptionalSupport.parseInt(row[5]));
      super.min(org.immersed.fooddatacentral.OptionalSupport.parseDouble(row[6]));
      super.max(org.immersed.fooddatacentral.OptionalSupport.parseDouble(row[7]));
      super.median(org.immersed.fooddatacentral.OptionalSupport.parseDouble(row[8]));
      super.footnote(Optional.ofNullable(row[9]));
      super.minYearAcquired(org.immersed.fooddatacentral.OptionalSupport.parseInt(row[10]));
      return this;
    }
  }
}
