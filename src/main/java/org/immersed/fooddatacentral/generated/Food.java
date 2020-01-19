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
      super.fdcId(Integer.parseInt(row[0]));
      super.dataType(row[1]);
      super.description(row[2]);
      super.foodCategoryId(Integer.parseInt(row[3]));
      super.publicationDate(LocalDate.parse(row[4]));
      return this;
    }
  }
}
