package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.util.OptionalInt;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from market_acquisition.csv. */
@FreeBuilder
interface MarketAcquisition {
  OptionalInt fdcId();

  String brandDescription();

  LocalDate expirationDate();

  OptionalInt labelWeight();

  String location();

  LocalDate acquisitionDate();

  String salesType();

  String sampleLotNbr();

  LocalDate sellByDate();

  String storeCity();

  String storeName();

  String storeState();

  String upcCode();

  class Builder extends MarketAcquisition_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
