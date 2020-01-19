package org.immersed.fooddatacentral.generated;

import java.lang.Override;
import java.lang.String;
import org.immersed.fooddatacentral.FoodDataBuilder;
import org.inferred.freebuilder.FreeBuilder;

/**
 * Auto-generated from acquisition_sample.csv. */
@FreeBuilder
interface AcquisitionSample {
  int fdcIdOfSampleFood();

  int fdcIdOfAcquisitionFood();

  class Builder extends AcquisitionSample_Builder implements FoodDataBuilder<Builder> {
    @Override
    public Builder fromCsv(String[] row) {
      return this;
    }
  }
}
