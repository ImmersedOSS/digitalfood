package org.immersed.fooddatacentral.generated;

import java.lang.String;
import java.time.LocalDate;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from market_acquisition.csv. */
@FreeBuilder
interface MarketAcquisition {
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
}
