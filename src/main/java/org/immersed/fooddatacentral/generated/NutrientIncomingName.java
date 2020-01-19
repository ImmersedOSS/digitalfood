package org.immersed.fooddatacentral.generated;

import java.lang.String;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from nutrient_incoming_name.csv. */
@FreeBuilder
interface NutrientIncomingName {
  int id();

  String name();

  int nutrientId();

  class Builder extends NutrientIncomingName_Builder {
  }
}
