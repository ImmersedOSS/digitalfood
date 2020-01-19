package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from market_acquisition.csv. */
@FreeBuilder
public interface MarketAcquisition {
  int fdcId();

  String brandDescription();

  LocalDate expirationDate();

  int labelWeight();

  String location();

  LocalDate acquisitionDate();

  String salesType();

  String sampleLotNbr();

  LocalDate sellByDate();

  String storeCity();

  String storeName();

  String storeState();

  String upcCode();

  class Builder extends MarketAcquisition_Builder implements FoodDataBuilder<Builder, MarketAcquisition> {
    @Override
    public Builder fromCsv(String[] row) {
      super.fdcId(Integer.parseInt(row[0]));
      super.brandDescription(row[1]);
      super.expirationDate(LocalDate.parse(row[2]));
      super.labelWeight(Integer.parseInt(row[3]));
      super.location(row[4]);
      super.acquisitionDate(LocalDate.parse(row[5]));
      super.salesType(row[6]);
      super.sampleLotNbr(row[7]);
      super.sellByDate(LocalDate.parse(row[8]));
      super.storeCity(row[9]);
      super.storeName(row[10]);
      super.storeState(row[11]);
      super.upcCode(row[12]);
      return this;
    }
  }
}
