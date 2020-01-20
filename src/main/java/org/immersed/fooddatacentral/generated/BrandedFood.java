package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.util.Optional;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from branded_food.csv. */
@FreeBuilder
public interface BrandedFood {
  int fdcId();

  Optional<String> brandOwner();

  String gtinUpc();

  Optional<String> ingredients();

  double servingSize();

  String servingSizeUnit();

  Optional<String> householdServingFulltext();

  Optional<String> brandedFoodCategory();

  String dataSource();

  LocalDate modifiedDate();

  Optional<LocalDate> availableDate();

  class Builder extends BrandedFood_Builder implements FoodDataBuilder<Builder, BrandedFood> {
    @Override
    public Builder fromCsv(String[] row) {
      super.fdcId(Integer.parseInt(row[0]));
      super.brandOwner(Optional.ofNullable(row[1]));
      super.gtinUpc(row[2]);
      super.ingredients(Optional.ofNullable(row[3]));
      super.servingSize(Double.parseDouble(row[4]));
      super.servingSizeUnit(row[5]);
      super.householdServingFulltext(Optional.ofNullable(row[6]));
      super.brandedFoodCategory(Optional.ofNullable(row[7]));
      super.dataSource(row[8]);
      super.modifiedDate(LocalDate.parse(row[9]));
      super.availableDate(Optional.ofNullable(LocalDate.parse(row[10])));
      return this;
    }
  }
}
