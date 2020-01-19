package org.immersed.fooddatacentral.generated;

import java.lang.String;
import java.time.LocalDate;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from agricultural_acquisition.csv. */
@FreeBuilder
interface AgriculturalAcquisition {
  int fdcId();

  LocalDate acquisitionDate();

  String marketClass();

  String treatment();

  String state();
}
