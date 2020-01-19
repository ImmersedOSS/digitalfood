package org.immersed.fooddatacentral.generated;

import java.lang.String;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food_attribute.csv. */
@FreeBuilder
interface FoodAttribute {
  int id();

  int fdcId();

  int seqNum();

  int foodAttributeTypeId();

  String name();

  String value();

  class Builder extends FoodAttribute_Builder {
  }
}
