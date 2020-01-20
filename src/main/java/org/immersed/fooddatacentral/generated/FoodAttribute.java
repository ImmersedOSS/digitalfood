package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.util.Optional;
import java.util.OptionalInt;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food_attribute.csv. */
@FreeBuilder
public interface FoodAttribute {
  int id();

  int fdcId();

  OptionalInt seqNum();

  int foodAttributeTypeId();

  Optional<String> name();

  Optional<String> value();

  class Builder extends FoodAttribute_Builder implements FoodDataBuilder<Builder, FoodAttribute> {
    @Override
    public Builder fromCsv(String[] row) {
      super.id(Integer.parseInt(row[0]));
      super.fdcId(Integer.parseInt(row[1]));
      super.seqNum(org.immersed.fooddatacentral.OptionalSupport.parseInt(row[2]));
      super.foodAttributeTypeId(Integer.parseInt(row[3]));
      super.name(Optional.ofNullable(row[4]));
      super.value(Optional.ofNullable(row[5]));
      return this;
    }
  }
}
