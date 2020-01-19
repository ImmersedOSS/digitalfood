package org.immersed.fooddatacentral.generated;

import java.lang.String;
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

  String modifiedDate();

  String availableDate();
}
