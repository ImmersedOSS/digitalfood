package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food.csv. */
@FreeBuilder
interface Food {
  int fdcId();

  String dataType();

  String description();

  int foodCategoryId();

  LocalDate publicationDate();

  class Builder extends Food_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
