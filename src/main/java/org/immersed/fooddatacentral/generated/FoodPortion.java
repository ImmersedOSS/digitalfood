package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.util.Optional;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food_portion.csv. */
@FreeBuilder
public interface FoodPortion {
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

  class Builder extends FoodPortion_Builder implements FoodDataBuilder<Builder, FoodPortion> {
    @Override
    public Builder fromCsv(String[] row) {
      super.id(Integer.parseInt(row[0]));
      super.fdcId(Integer.parseInt(row[1]));
      super.seqNum(Integer.parseInt(row[2]));
      super.amount(Double.parseDouble(row[3]));
      super.measureUnitId(Integer.parseInt(row[4]));
      super.portionDescription(row[5]);
      super.modifier(row[6]);
      super.gramWeight(Double.parseDouble(row[7]));
      super.dataPoints(Integer.parseInt(row[8]));
      super.footnote(Optional.ofNullable(row[9]));
      super.minYearAcquired(Integer.parseInt(row[10]));
      return this;
    }
  }
}
