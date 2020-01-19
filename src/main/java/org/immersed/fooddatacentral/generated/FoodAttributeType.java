package org.immersed.fooddatacentral.generated;

import java.lang.String;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from food_attribute_type.csv. */
@FreeBuilder
interface FoodAttributeType {
  int id();

  String name();

  String description();

  class Builder extends FoodAttributeType_Builder {
  }
}
