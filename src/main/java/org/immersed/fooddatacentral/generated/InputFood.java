package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from input_food.csv. */
@FreeBuilder
public interface InputFood {
  int id();

  int fdcId();

  OptionalInt fdcIdOfInputFood();

  OptionalInt seqNum();

  OptionalDouble amount();

  OptionalInt srCode();

  Optional<String> srDescription();

  Optional<String> unit();

  OptionalInt portionCode();

  Optional<String> portionDescription();

  OptionalDouble gramWeight();

  OptionalInt retentionCode();

  OptionalInt surveyFlag();

  class Builder extends InputFood_Builder implements FoodDataBuilder<Builder, InputFood> {
    @Override
    public Builder fromCsv(String[] row) {
      super.id(Integer.parseInt(row[0]));
      super.fdcId(Integer.parseInt(row[1]));
      super.fdcIdOfInputFood(org.immersed.fooddatacentral.OptionalSupport.parseInt(row[2]));
      super.seqNum(org.immersed.fooddatacentral.OptionalSupport.parseInt(row[3]));
      super.amount(org.immersed.fooddatacentral.OptionalSupport.parseDouble(row[4]));
      super.srCode(org.immersed.fooddatacentral.OptionalSupport.parseInt(row[5]));
      super.srDescription(Optional.ofNullable(row[6]));
      super.unit(Optional.ofNullable(row[7]));
      super.portionCode(org.immersed.fooddatacentral.OptionalSupport.parseInt(row[8]));
      super.portionDescription(Optional.ofNullable(row[9]));
      super.gramWeight(org.immersed.fooddatacentral.OptionalSupport.parseDouble(row[10]));
      super.retentionCode(org.immersed.fooddatacentral.OptionalSupport.parseInt(row[11]));
      super.surveyFlag(org.immersed.fooddatacentral.OptionalSupport.parseInt(row[12]));
      return this;
    }
  }
}
