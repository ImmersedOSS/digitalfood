package org.immersed.fooddatacentral.generated;

import java.lang.String;
import java.time.LocalDate;
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
}
