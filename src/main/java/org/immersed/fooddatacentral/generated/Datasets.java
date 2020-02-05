package org.immersed.fooddatacentral.generated;

import java.io.IOException;
import java.lang.IllegalStateException;
import java.util.Collections;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.immersed.fooddatacentral.CsvDataset;
import org.immersed.fooddatacentral.ZipLoader;

public final class Datasets {
  private static final List<WweiaFoodCategory> WWEIA_FOOD_CATEGORY_LIST;

  private static final List<FoodCategory> FOOD_CATEGORY_LIST;

  private static final List<RetentionFactor> RETENTION_FACTOR_LIST;

  private static final List<FoodAttributeType> FOOD_ATTRIBUTE_TYPE_LIST;

  private static final List<Nutrient> NUTRIENT_LIST;

  private static final List<NutrientIncomingName> NUTRIENT_INCOMING_NAME_LIST;

  private static final List<MeasureUnit> MEASURE_UNIT_LIST;

  private static final List<FoodNutrientSource> FOOD_NUTRIENT_SOURCE_LIST;

  private static final List<FoodNutrientDerivation> FOOD_NUTRIENT_DERIVATION_LIST;

  private static final List<LabMethod> LAB_METHOD_LIST;

  private static final List<LabMethodCode> LAB_METHOD_CODE_LIST;

  private static final List<LabMethodNutrient> LAB_METHOD_NUTRIENT_LIST;

  private static final List<Food> FOOD_LIST;

  private static final List<FoodNutrient> FOOD_NUTRIENT_LIST;

  private static final List<FoodPortion> FOOD_PORTION_LIST;

  private static final List<FoodComponent> FOOD_COMPONENT_LIST;

  private static final List<AgriculturalAcquisition> AGRICULTURAL_ACQUISITION_LIST;

  private static final List<SurveyFnddsFood> SURVEY_FNDDS_FOOD_LIST;

  private static final List<BrandedFood> BRANDED_FOOD_LIST;

  private static final List<FoodUpdateLogEntry> FOOD_UPDATE_LOG_ENTRY_LIST;

  private static final List<SrLegacyFood> SR_LEGACY_FOOD_LIST;

  private static final List<FoundationFood> FOUNDATION_FOOD_LIST;

  private static final List<SampleFood> SAMPLE_FOOD_LIST;

  private static final List<SubSampleFood> SUB_SAMPLE_FOOD_LIST;

  private static final List<SubSampleResult> SUB_SAMPLE_RESULT_LIST;

  private static final List<MarketAcquisition> MARKET_ACQUISITION_LIST;

  private static final List<AcquisitionSample> ACQUISITION_SAMPLE_LIST;

  private static final List<InputFood> INPUT_FOOD_LIST;

  private static final List<FoodAttribute> FOOD_ATTRIBUTE_LIST;

  private static final List<FoodCalorieConversionFactor> FOOD_CALORIE_CONVERSION_FACTOR_LIST;

  private static final List<FoodProteinConversionFactor> FOOD_PROTEIN_CONVERSION_FACTOR_LIST;

  private static final List<FoodNutrientConversionFactor> FOOD_NUTRIENT_CONVERSION_FACTOR_LIST;

  static {
    try (ZipFile zipFile = ZipLoader.load())
    {
      ZipEntry wweiaFoodCategory = zipFile.getEntry("wweia_food_category.csv");
      WWEIA_FOOD_CATEGORY_LIST = new CsvDataset<>(new WweiaFoodCategory.Builder(), zipFile.getInputStream(wweiaFoodCategory)).getData();
      ZipEntry foodCategory = zipFile.getEntry("food_category.csv");
      FOOD_CATEGORY_LIST = new CsvDataset<>(new FoodCategory.Builder(), zipFile.getInputStream(foodCategory)).getData();
      ZipEntry retentionFactor = zipFile.getEntry("retention_factor.csv");
      RETENTION_FACTOR_LIST = new CsvDataset<>(new RetentionFactor.Builder(), zipFile.getInputStream(retentionFactor)).getData();
      ZipEntry foodAttributeType = zipFile.getEntry("food_attribute_type.csv");
      FOOD_ATTRIBUTE_TYPE_LIST = new CsvDataset<>(new FoodAttributeType.Builder(), zipFile.getInputStream(foodAttributeType)).getData();
      ZipEntry nutrient = zipFile.getEntry("nutrient.csv");
      NUTRIENT_LIST = new CsvDataset<>(new Nutrient.Builder(), zipFile.getInputStream(nutrient)).getData();
      ZipEntry nutrientIncomingName = zipFile.getEntry("nutrient_incoming_name.csv");
      NUTRIENT_INCOMING_NAME_LIST = new CsvDataset<>(new NutrientIncomingName.Builder(), zipFile.getInputStream(nutrientIncomingName)).getData();
      ZipEntry measureUnit = zipFile.getEntry("measure_unit.csv");
      MEASURE_UNIT_LIST = new CsvDataset<>(new MeasureUnit.Builder(), zipFile.getInputStream(measureUnit)).getData();
      ZipEntry foodNutrientSource = zipFile.getEntry("food_nutrient_source.csv");
      FOOD_NUTRIENT_SOURCE_LIST = new CsvDataset<>(new FoodNutrientSource.Builder(), zipFile.getInputStream(foodNutrientSource)).getData();
      ZipEntry foodNutrientDerivation = zipFile.getEntry("food_nutrient_derivation.csv");
      FOOD_NUTRIENT_DERIVATION_LIST = new CsvDataset<>(new FoodNutrientDerivation.Builder(), zipFile.getInputStream(foodNutrientDerivation)).getData();
      ZipEntry labMethod = zipFile.getEntry("lab_method.csv");
      LAB_METHOD_LIST = new CsvDataset<>(new LabMethod.Builder(), zipFile.getInputStream(labMethod)).getData();
      ZipEntry labMethodCode = zipFile.getEntry("lab_method_code.csv");
      LAB_METHOD_CODE_LIST = new CsvDataset<>(new LabMethodCode.Builder(), zipFile.getInputStream(labMethodCode)).getData();
      ZipEntry labMethodNutrient = zipFile.getEntry("lab_method_nutrient.csv");
      LAB_METHOD_NUTRIENT_LIST = new CsvDataset<>(new LabMethodNutrient.Builder(), zipFile.getInputStream(labMethodNutrient)).getData();
      ZipEntry food = zipFile.getEntry("food.csv");
      FOOD_LIST = new CsvDataset<>(new Food.Builder(), zipFile.getInputStream(food)).getData();
      ZipEntry foodNutrient = zipFile.getEntry("food_nutrient.csv");
      FOOD_NUTRIENT_LIST = new CsvDataset<>(new FoodNutrient.Builder(), zipFile.getInputStream(foodNutrient)).getData();
      ZipEntry foodPortion = zipFile.getEntry("food_portion.csv");
      FOOD_PORTION_LIST = new CsvDataset<>(new FoodPortion.Builder(), zipFile.getInputStream(foodPortion)).getData();
      ZipEntry foodComponent = zipFile.getEntry("food_component.csv");
      FOOD_COMPONENT_LIST = new CsvDataset<>(new FoodComponent.Builder(), zipFile.getInputStream(foodComponent)).getData();
      ZipEntry agriculturalAcquisition = zipFile.getEntry("agricultural_acquisition.csv");
      AGRICULTURAL_ACQUISITION_LIST = new CsvDataset<>(new AgriculturalAcquisition.Builder(), zipFile.getInputStream(agriculturalAcquisition)).getData();
      ZipEntry surveyFnddsFood = zipFile.getEntry("survey_fndds_food.csv");
      SURVEY_FNDDS_FOOD_LIST = new CsvDataset<>(new SurveyFnddsFood.Builder(), zipFile.getInputStream(surveyFnddsFood)).getData();
      ZipEntry brandedFood = zipFile.getEntry("branded_food.csv");
      BRANDED_FOOD_LIST = new CsvDataset<>(new BrandedFood.Builder(), zipFile.getInputStream(brandedFood)).getData();
      ZipEntry foodUpdateLogEntry = zipFile.getEntry("food_update_log_entry.csv");
      FOOD_UPDATE_LOG_ENTRY_LIST = new CsvDataset<>(new FoodUpdateLogEntry.Builder(), zipFile.getInputStream(foodUpdateLogEntry)).getData();
      ZipEntry srLegacyFood = zipFile.getEntry("sr_legacy_food.csv");
      SR_LEGACY_FOOD_LIST = new CsvDataset<>(new SrLegacyFood.Builder(), zipFile.getInputStream(srLegacyFood)).getData();
      ZipEntry foundationFood = zipFile.getEntry("foundation_food.csv");
      FOUNDATION_FOOD_LIST = new CsvDataset<>(new FoundationFood.Builder(), zipFile.getInputStream(foundationFood)).getData();
      ZipEntry sampleFood = zipFile.getEntry("sample_food.csv");
      SAMPLE_FOOD_LIST = new CsvDataset<>(new SampleFood.Builder(), zipFile.getInputStream(sampleFood)).getData();
      ZipEntry subSampleFood = zipFile.getEntry("sub_sample_food.csv");
      SUB_SAMPLE_FOOD_LIST = new CsvDataset<>(new SubSampleFood.Builder(), zipFile.getInputStream(subSampleFood)).getData();
      ZipEntry subSampleResult = zipFile.getEntry("sub_sample_result.csv");
      SUB_SAMPLE_RESULT_LIST = new CsvDataset<>(new SubSampleResult.Builder(), zipFile.getInputStream(subSampleResult)).getData();
      ZipEntry marketAcquisition = zipFile.getEntry("market_acquisition.csv");
      MARKET_ACQUISITION_LIST = new CsvDataset<>(new MarketAcquisition.Builder(), zipFile.getInputStream(marketAcquisition)).getData();
      ZipEntry acquisitionSample = zipFile.getEntry("acquisition_sample.csv");
      ACQUISITION_SAMPLE_LIST = new CsvDataset<>(new AcquisitionSample.Builder(), zipFile.getInputStream(acquisitionSample)).getData();
      ZipEntry inputFood = zipFile.getEntry("input_food.csv");
      INPUT_FOOD_LIST = new CsvDataset<>(new InputFood.Builder(), zipFile.getInputStream(inputFood)).getData();
      ZipEntry foodAttribute = zipFile.getEntry("food_attribute.csv");
      FOOD_ATTRIBUTE_LIST = new CsvDataset<>(new FoodAttribute.Builder(), zipFile.getInputStream(foodAttribute)).getData();
      ZipEntry foodCalorieConversionFactor = zipFile.getEntry("food_calorie_conversion_factor.csv");
      FOOD_CALORIE_CONVERSION_FACTOR_LIST = new CsvDataset<>(new FoodCalorieConversionFactor.Builder(), zipFile.getInputStream(foodCalorieConversionFactor)).getData();
      ZipEntry foodProteinConversionFactor = zipFile.getEntry("food_protein_conversion_factor.csv");
      FOOD_PROTEIN_CONVERSION_FACTOR_LIST = new CsvDataset<>(new FoodProteinConversionFactor.Builder(), zipFile.getInputStream(foodProteinConversionFactor)).getData();
      ZipEntry foodNutrientConversionFactor = zipFile.getEntry("food_nutrient_conversion_factor.csv");
      FOOD_NUTRIENT_CONVERSION_FACTOR_LIST = new CsvDataset<>(new FoodNutrientConversionFactor.Builder(), zipFile.getInputStream(foodNutrientConversionFactor)).getData();
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  private Datasets() {
  }

  public static List<WweiaFoodCategory> wweiaFoodCategories() {
    return Collections.unmodifiableList(WWEIA_FOOD_CATEGORY_LIST);
  }

  public static List<FoodCategory> foodCategories() {
    return Collections.unmodifiableList(FOOD_CATEGORY_LIST);
  }

  public static List<RetentionFactor> retentionFactors() {
    return Collections.unmodifiableList(RETENTION_FACTOR_LIST);
  }

  public static List<FoodAttributeType> foodAttributeTypes() {
    return Collections.unmodifiableList(FOOD_ATTRIBUTE_TYPE_LIST);
  }

  public static List<Nutrient> nutrients() {
    return Collections.unmodifiableList(NUTRIENT_LIST);
  }

  public static List<NutrientIncomingName> nutrientIncomingNames() {
    return Collections.unmodifiableList(NUTRIENT_INCOMING_NAME_LIST);
  }

  public static List<MeasureUnit> measureUnits() {
    return Collections.unmodifiableList(MEASURE_UNIT_LIST);
  }

  public static List<FoodNutrientSource> foodNutrientSources() {
    return Collections.unmodifiableList(FOOD_NUTRIENT_SOURCE_LIST);
  }

  public static List<FoodNutrientDerivation> foodNutrientDerivations() {
    return Collections.unmodifiableList(FOOD_NUTRIENT_DERIVATION_LIST);
  }

  public static List<LabMethod> labMethods() {
    return Collections.unmodifiableList(LAB_METHOD_LIST);
  }

  public static List<LabMethodCode> labMethodCodes() {
    return Collections.unmodifiableList(LAB_METHOD_CODE_LIST);
  }

  public static List<LabMethodNutrient> labMethodNutrients() {
    return Collections.unmodifiableList(LAB_METHOD_NUTRIENT_LIST);
  }

  public static List<Food> foods() {
    return Collections.unmodifiableList(FOOD_LIST);
  }

  public static List<FoodNutrient> foodNutrients() {
    return Collections.unmodifiableList(FOOD_NUTRIENT_LIST);
  }

  public static List<FoodPortion> foodPortions() {
    return Collections.unmodifiableList(FOOD_PORTION_LIST);
  }

  public static List<FoodComponent> foodComponents() {
    return Collections.unmodifiableList(FOOD_COMPONENT_LIST);
  }

  public static List<AgriculturalAcquisition> agriculturalAcquisitions() {
    return Collections.unmodifiableList(AGRICULTURAL_ACQUISITION_LIST);
  }

  public static List<SurveyFnddsFood> surveyFnddsFoods() {
    return Collections.unmodifiableList(SURVEY_FNDDS_FOOD_LIST);
  }

  public static List<BrandedFood> brandedFoods() {
    return Collections.unmodifiableList(BRANDED_FOOD_LIST);
  }

  public static List<FoodUpdateLogEntry> foodUpdateLogEntries() {
    return Collections.unmodifiableList(FOOD_UPDATE_LOG_ENTRY_LIST);
  }

  public static List<SrLegacyFood> srLegacyFoods() {
    return Collections.unmodifiableList(SR_LEGACY_FOOD_LIST);
  }

  public static List<FoundationFood> foundationFoods() {
    return Collections.unmodifiableList(FOUNDATION_FOOD_LIST);
  }

  public static List<SampleFood> sampleFoods() {
    return Collections.unmodifiableList(SAMPLE_FOOD_LIST);
  }

  public static List<SubSampleFood> subSampleFoods() {
    return Collections.unmodifiableList(SUB_SAMPLE_FOOD_LIST);
  }

  public static List<SubSampleResult> subSampleResults() {
    return Collections.unmodifiableList(SUB_SAMPLE_RESULT_LIST);
  }

  public static List<MarketAcquisition> marketAcquisitions() {
    return Collections.unmodifiableList(MARKET_ACQUISITION_LIST);
  }

  public static List<AcquisitionSample> acquisitionSamples() {
    return Collections.unmodifiableList(ACQUISITION_SAMPLE_LIST);
  }

  public static List<InputFood> inputFoods() {
    return Collections.unmodifiableList(INPUT_FOOD_LIST);
  }

  public static List<FoodAttribute> foodAttributes() {
    return Collections.unmodifiableList(FOOD_ATTRIBUTE_LIST);
  }

  public static List<FoodCalorieConversionFactor> foodCalorieConversionFactors() {
    return Collections.unmodifiableList(FOOD_CALORIE_CONVERSION_FACTOR_LIST);
  }

  public static List<FoodProteinConversionFactor> foodProteinConversionFactors() {
    return Collections.unmodifiableList(FOOD_PROTEIN_CONVERSION_FACTOR_LIST);
  }

  public static List<FoodNutrientConversionFactor> foodNutrientConversionFactors() {
    return Collections.unmodifiableList(FOOD_NUTRIENT_CONVERSION_FACTOR_LIST);
  }
}
