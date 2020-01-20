package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import java.util.Optional;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from foundation_food.csv. */
@FreeBuilder
public interface FoundationFood {
  int fdcId();

  int ndbNumber();

  Optional<String> footnote();

  class Builder extends FoundationFood_Builder implements FoodDataBuilder<Builder, FoundationFood> {
    @Override
    public Builder fromCsv(String[] row) {
      super.fdcId(Integer.parseInt(row[0]));
      super.ndbNumber(Integer.parseInt(row[1]));
      super.footnote(Optional.ofNullable(row[2]));
      return this;
    }
  }
}
