package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.util.Optional;
import java.util.OptionalInt;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from market_acquisition.csv. */
@FreeBuilder
public interface MarketAcquisition {
  int fdcId();

  Optional<String> brandDescription();

  Optional<LocalDate> expirationDate();

  OptionalInt labelWeight();

  Optional<String> location();

  Optional<LocalDate> acquisitionDate();

  Optional<String> salesType();

  Optional<String> sampleLotNbr();

  Optional<LocalDate> sellByDate();

  Optional<String> storeCity();

  Optional<String> storeName();

  Optional<String> storeState();

  Optional<String> upcCode();

  class Builder extends MarketAcquisition_Builder implements FoodDataBuilder<Builder, MarketAcquisition> {
    @Override
    public Builder fromCsv(String[] row) {
      super.fdcId(Integer.parseInt(row[0]));
      super.brandDescription(Optional.ofNullable(row[1]));
      super.expirationDate(Optional.ofNullable(LocalDate.parse(row[2])));
      super.labelWeight(org.immersed.fooddatacentral.OptionalSupport.parseInt(row[3]));
      super.location(Optional.ofNullable(row[4]));
      super.acquisitionDate(Optional.ofNullable(LocalDate.parse(row[5])));
      super.salesType(Optional.ofNullable(row[6]));
      super.sampleLotNbr(Optional.ofNullable(row[7]));
      super.sellByDate(Optional.ofNullable(LocalDate.parse(row[8])));
      super.storeCity(Optional.ofNullable(row[9]));
      super.storeName(Optional.ofNullable(row[10]));
      super.storeState(Optional.ofNullable(row[11]));
      super.upcCode(Optional.ofNullable(row[12]));
      return this;
    }
  }
}
