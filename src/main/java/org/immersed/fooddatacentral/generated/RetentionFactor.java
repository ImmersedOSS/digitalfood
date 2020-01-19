package org.immersed.fooddatacentral.generated;

import java.lang.String;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from retention_factor.csv. */
@FreeBuilder
interface RetentionFactor {
  int id();

  int code();

  int foodGroupId();

  String description();

  class Builder extends RetentionFactor_Builder {
  }
}
