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
public interface Food {
  int fdcId();

  String dataType();

  String description();

  OptionalInt foodCategoryId();

  LocalDate publicationDate();

  class Builder extends Food_Builder implements FoodDataBuilder<Builder, Food> {
    @Override
    public Builder fromCsv(String[] row) {
      super.fdcId(Integer.parseInt(row[0]));
      super.dataType(row[1]);
      super.description(row[2]);
      super.foodCategoryId(org.immersed.fooddatacentral.OptionalSupport.parseInt(row[3]));
      super.publicationDate(LocalDate.parse(row[4]));
      return this;
    }
  }
}
