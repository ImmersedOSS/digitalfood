package org.immersed.fooddatacentral.generated;

import java.lang.String;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from input_food.csv. */
@FreeBuilder
interface InputFood {
  int id();

  int fdcId();

  int fdcIdOfInputFood();

  int seqNum();

  double amount();

  int srCode();

  String srDescription();

  String unit();

  int portionCode();

  String portionDescription();

  double gramWeight();

  int retentionCode();

  int surveyFlag();

  class Builder extends InputFood_Builder {
  }
}
