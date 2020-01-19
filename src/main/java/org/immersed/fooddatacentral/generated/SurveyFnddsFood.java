package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from survey_fndds_food.csv. */
@FreeBuilder
interface SurveyFnddsFood {
  int fdcId();

  int foodCode();

  int wweiaCategoryCode();

  LocalDate startDate();

  LocalDate endDate();

  class Builder extends SurveyFnddsFood_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
