package org.immersed.fooddatacentral.generated;

import java.lang.String;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from nutrient.csv. */
@FreeBuilder
interface Nutrient {
  int id();

  String name();

  String unitName();

  double nutrientNbr();

  int rank();

  class Builder extends Nutrient_Builder {
  }
}
