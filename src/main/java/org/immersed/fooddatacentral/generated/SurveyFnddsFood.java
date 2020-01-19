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

  class Builder extends SurveyFnddsFood_Builder implements FoodDataBuilder<Builder, SurveyFnddsFood> {
    @Override
    public Builder fromCsv(String[] row) {
      super.fdcId(Integer.parseInt(row[0]));
      super.foodCode(Integer.parseInt(row[1]));
      super.wweiaCategoryCode(Integer.parseInt(row[2]));
      super.startDate(LocalDate.parse(row[3]));
      super.endDate(LocalDate.parse(row[4]));
      return this;
    }
  }
}
