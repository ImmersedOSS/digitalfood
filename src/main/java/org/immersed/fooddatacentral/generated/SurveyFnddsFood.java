package org.immersed.fooddatacentral.generated;

import java.time.LocalDate;
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
}
