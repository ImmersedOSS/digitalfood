package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from branded_food.csv. */
@FreeBuilder
interface BrandedFood {
  int fdcId();

  String brandOwner();

  String gtinUpc();

  String ingredients();

  double servingSize();

  String servingSizeUnit();

  String householdServingFulltext();

  String brandedFoodCategory();

  String dataSource();

  LocalDate modifiedDate();

  LocalDate availableDate();

  class Builder extends BrandedFood_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
