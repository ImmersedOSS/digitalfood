package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import org.immersed.fooddatacentral.FoodDataBuilder;
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

  class Builder extends AgriculturalAcquisition_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
