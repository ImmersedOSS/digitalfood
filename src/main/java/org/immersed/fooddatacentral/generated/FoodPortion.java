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
public interface FoodPortion {
  int id();

  int fdcId();

  OptionalInt seqNum();

  OptionalDouble amount();

  int measureUnitId();

  Optional<String> portionDescription();

  Optional<String> modifier();

  double gramWeight();

  OptionalInt dataPoints();

  Optional<String> footnote();

  OptionalInt minYearAcquired();

  class Builder extends FoodPortion_Builder implements FoodDataBuilder<Builder, FoodPortion> {
    @Override
    public Builder fromCsv(String[] row) {
      super.id(Integer.parseInt(row[0]));
      super.fdcId(Integer.parseInt(row[1]));
      super.seqNum(org.immersed.fooddatacentral.OptionalSupport.parseInt(row[2]));
      super.amount(org.immersed.fooddatacentral.OptionalSupport.parseDouble(row[3]));
      super.measureUnitId(Integer.parseInt(row[4]));
      super.portionDescription(Optional.ofNullable(row[5]));
      super.modifier(Optional.ofNullable(row[6]));
      super.gramWeight(Double.parseDouble(row[7]));
      super.dataPoints(org.immersed.fooddatacentral.OptionalSupport.parseInt(row[8]));
      super.footnote(Optional.ofNullable(row[9]));
      super.minYearAcquired(org.immersed.fooddatacentral.OptionalSupport.parseInt(row[10]));
      return this;
    }
  }
}
