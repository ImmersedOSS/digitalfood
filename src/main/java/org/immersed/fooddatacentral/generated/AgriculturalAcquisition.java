package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from agricultural_acquisition.csv. */
@FreeBuilder
public interface AgriculturalAcquisition {
  int fdcId();

  LocalDate acquisitionDate();

  String marketClass();

  String treatment();

  String state();

  class Builder extends AgriculturalAcquisition_Builder implements FoodDataBuilder<Builder, AgriculturalAcquisition> {
    @Override
    public Builder fromCsv(String[] row) {
      super.fdcId(Integer.parseInt(row[0]));
      super.acquisitionDate(LocalDate.parse(row[1]));
      super.marketClass(row[2]);
      super.treatment(row[3]);
      super.state(row[4]);
      return this;
    }
  }
}
