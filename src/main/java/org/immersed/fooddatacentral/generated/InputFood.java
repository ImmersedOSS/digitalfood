package org.immersed.fooddatacentral.generated;

import java.lang.String;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from input_food.csv. */
@FreeBuilder
interface InputFood {
  int id();

  int fdcId();

  String fdcIdOfInputFood();

  String seqNum();

  String amount();

  String srCode();

  String srDescription();

  String unit();

  String portionCode();

  String portionDescription();

  String gramWeight();

  String retentionCode();

  String surveyFlag();
}
