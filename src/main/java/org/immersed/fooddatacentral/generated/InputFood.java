package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from input_food.csv. */
@FreeBuilder
interface InputFood {
  int id();

  int fdcId();

  int fdcIdOfInputFood();

  int seqNum();

  double amount();

  int srCode();

  String srDescription();

  String unit();

  int portionCode();

  String portionDescription();

  double gramWeight();

  int retentionCode();

  int surveyFlag();

  class Builder extends InputFood_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      super.id(Integer.parseInt(row[0]));
      super.fdcId(Integer.parseInt(row[1]));
      super.fdcIdOfInputFood(Integer.parseInt(row[2]));
      super.seqNum(Integer.parseInt(row[3]));
      super.amount(Double.parseDouble(row[4]));
      super.srCode(Integer.parseInt(row[5]));
      super.srDescription(row[6]);
      super.unit(row[7]);
      super.portionCode(Integer.parseInt(row[8]));
      super.portionDescription(row[9]);
      super.gramWeight(Double.parseDouble(row[10]));
      super.retentionCode(Integer.parseInt(row[11]));
      super.surveyFlag(Integer.parseInt(row[12]));
      return this;
    }
  }
}
