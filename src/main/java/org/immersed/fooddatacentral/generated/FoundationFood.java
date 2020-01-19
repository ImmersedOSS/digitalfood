package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from foundation_food.csv. */
@FreeBuilder
interface FoundationFood {
  int fdcId();

  int ndbNumber();

  String footnote();

  class Builder extends FoundationFood_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      super.fdcId(Integer.parseInt(row[0]));
      super.ndbNumber(Integer.parseInt(row[1]));
      super.footnote(row[2]);
      return this;
    }
  }
}
