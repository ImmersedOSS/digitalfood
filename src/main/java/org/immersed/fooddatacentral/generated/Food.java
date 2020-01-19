package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.util.OptionalInt;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food.csv. */
@FreeBuilder
interface Food {
  OptionalInt fdcId();

  String dataType();

  String description();

  OptionalInt foodCategoryId();

  LocalDate publicationDate();

  class Builder extends Food_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
