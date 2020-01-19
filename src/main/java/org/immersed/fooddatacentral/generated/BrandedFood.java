package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from branded_food.csv. */
@FreeBuilder
public interface BrandedFood {
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

  class Builder extends BrandedFood_Builder implements FoodDataBuilder<Builder, BrandedFood> {
    @Override
    public Builder fromCsv(String[] row) {
      super.fdcId(Integer.parseInt(row[0]));
      super.brandOwner(row[1]);
      super.gtinUpc(row[2]);
      super.ingredients(row[3]);
      super.servingSize(Double.parseDouble(row[4]));
      super.servingSizeUnit(row[5]);
      super.householdServingFulltext(row[6]);
      super.brandedFoodCategory(row[7]);
      super.dataSource(row[8]);
      super.modifiedDate(LocalDate.parse(row[9]));
      super.availableDate(LocalDate.parse(row[10]));
      return this;
    }
  }
}
