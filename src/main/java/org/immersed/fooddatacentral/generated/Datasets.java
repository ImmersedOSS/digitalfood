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
  private static List<WweiaFoodCategory> wweiaFoodCategoryList;

  private static List<FoodCategory> foodCategoryList;

  private static List<RetentionFactor> retentionFactorList;

  private static List<FoodAttributeType> foodAttributeTypeList;

  private static List<Nutrient> nutrientList;

  private static List<NutrientIncomingName> nutrientIncomingNameList;

  private static List<MeasureUnit> measureUnitList;

  private static List<FoodNutrientSource> foodNutrientSourceList;

  private static List<FoodNutrientDerivation> foodNutrientDerivationList;

  private static List<LabMethod> labMethodList;

  private static List<LabMethodCode> labMethodCodeList;

  private static List<LabMethodNutrient> labMethodNutrientList;

  private static List<Food> foodList;

  private static List<FoodNutrient> foodNutrientList;

  private static List<FoodPortion> foodPortionList;

  private static List<FoodComponent> foodComponentList;

  private static List<AgriculturalAcquisition> agriculturalAcquisitionList;

  private static List<SurveyFnddsFood> surveyFnddsFoodList;

  private static List<BrandedFood> brandedFoodList;

  private static List<FoodUpdateLogEntry> foodUpdateLogEntryList;

  private static List<SrLegacyFood> srLegacyFoodList;

  private static List<FoundationFood> foundationFoodList;

  private static List<SampleFood> sampleFoodList;

  private static List<SubSampleFood> subSampleFoodList;

  private static List<SubSampleResult> subSampleResultList;

  private static List<MarketAcquisition> marketAcquisitionList;

  private static List<AcquisitionSample> acquisitionSampleList;

  private static List<InputFood> inputFoodList;

  private static List<FoodAttribute> foodAttributeList;

  private static List<FoodCalorieConversionFactor> foodCalorieConversionFactorList;

  private static List<FoodProteinConversionFactor> foodProteinConversionFactorList;

  private static List<FoodNutrientConversionFactor> foodNutrientConversionFactorList;

  private Datasets() {
  }

  public static List<WweiaFoodCategory> wweiaFoodCategories() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(wweiaFoodCategoryList == null) {
        ZipEntry wweiaFoodCategory = zipFile.getEntry("wweia_food_category.csv");
        wweiaFoodCategoryList = new CsvDataset<>(new WweiaFoodCategory.Builder(), zipFile.getInputStream(wweiaFoodCategory)).getData();
      }
      return Collections.unmodifiableList(wweiaFoodCategoryList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<FoodCategory> foodCategories() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(foodCategoryList == null) {
        ZipEntry foodCategory = zipFile.getEntry("food_category.csv");
        foodCategoryList = new CsvDataset<>(new FoodCategory.Builder(), zipFile.getInputStream(foodCategory)).getData();
      }
      return Collections.unmodifiableList(foodCategoryList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<RetentionFactor> retentionFactors() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(retentionFactorList == null) {
        ZipEntry retentionFactor = zipFile.getEntry("retention_factor.csv");
        retentionFactorList = new CsvDataset<>(new RetentionFactor.Builder(), zipFile.getInputStream(retentionFactor)).getData();
      }
      return Collections.unmodifiableList(retentionFactorList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<FoodAttributeType> foodAttributeTypes() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(foodAttributeTypeList == null) {
        ZipEntry foodAttributeType = zipFile.getEntry("food_attribute_type.csv");
        foodAttributeTypeList = new CsvDataset<>(new FoodAttributeType.Builder(), zipFile.getInputStream(foodAttributeType)).getData();
      }
      return Collections.unmodifiableList(foodAttributeTypeList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<Nutrient> nutrients() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(nutrientList == null) {
        ZipEntry nutrient = zipFile.getEntry("nutrient.csv");
        nutrientList = new CsvDataset<>(new Nutrient.Builder(), zipFile.getInputStream(nutrient)).getData();
      }
      return Collections.unmodifiableList(nutrientList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<NutrientIncomingName> nutrientIncomingNames() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(nutrientIncomingNameList == null) {
        ZipEntry nutrientIncomingName = zipFile.getEntry("nutrient_incoming_name.csv");
        nutrientIncomingNameList = new CsvDataset<>(new NutrientIncomingName.Builder(), zipFile.getInputStream(nutrientIncomingName)).getData();
      }
      return Collections.unmodifiableList(nutrientIncomingNameList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<MeasureUnit> measureUnits() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(measureUnitList == null) {
        ZipEntry measureUnit = zipFile.getEntry("measure_unit.csv");
        measureUnitList = new CsvDataset<>(new MeasureUnit.Builder(), zipFile.getInputStream(measureUnit)).getData();
      }
      return Collections.unmodifiableList(measureUnitList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<FoodNutrientSource> foodNutrientSources() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(foodNutrientSourceList == null) {
        ZipEntry foodNutrientSource = zipFile.getEntry("food_nutrient_source.csv");
        foodNutrientSourceList = new CsvDataset<>(new FoodNutrientSource.Builder(), zipFile.getInputStream(foodNutrientSource)).getData();
      }
      return Collections.unmodifiableList(foodNutrientSourceList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<FoodNutrientDerivation> foodNutrientDerivations() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(foodNutrientDerivationList == null) {
        ZipEntry foodNutrientDerivation = zipFile.getEntry("food_nutrient_derivation.csv");
        foodNutrientDerivationList = new CsvDataset<>(new FoodNutrientDerivation.Builder(), zipFile.getInputStream(foodNutrientDerivation)).getData();
      }
      return Collections.unmodifiableList(foodNutrientDerivationList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<LabMethod> labMethods() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(labMethodList == null) {
        ZipEntry labMethod = zipFile.getEntry("lab_method.csv");
        labMethodList = new CsvDataset<>(new LabMethod.Builder(), zipFile.getInputStream(labMethod)).getData();
      }
      return Collections.unmodifiableList(labMethodList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<LabMethodCode> labMethodCodes() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(labMethodCodeList == null) {
        ZipEntry labMethodCode = zipFile.getEntry("lab_method_code.csv");
        labMethodCodeList = new CsvDataset<>(new LabMethodCode.Builder(), zipFile.getInputStream(labMethodCode)).getData();
      }
      return Collections.unmodifiableList(labMethodCodeList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<LabMethodNutrient> labMethodNutrients() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(labMethodNutrientList == null) {
        ZipEntry labMethodNutrient = zipFile.getEntry("lab_method_nutrient.csv");
        labMethodNutrientList = new CsvDataset<>(new LabMethodNutrient.Builder(), zipFile.getInputStream(labMethodNutrient)).getData();
      }
      return Collections.unmodifiableList(labMethodNutrientList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<Food> foods() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(foodList == null) {
        ZipEntry food = zipFile.getEntry("food.csv");
        foodList = new CsvDataset<>(new Food.Builder(), zipFile.getInputStream(food)).getData();
      }
      return Collections.unmodifiableList(foodList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<FoodNutrient> foodNutrients() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(foodNutrientList == null) {
        ZipEntry foodNutrient = zipFile.getEntry("food_nutrient.csv");
        foodNutrientList = new CsvDataset<>(new FoodNutrient.Builder(), zipFile.getInputStream(foodNutrient)).getData();
      }
      return Collections.unmodifiableList(foodNutrientList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<FoodPortion> foodPortions() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(foodPortionList == null) {
        ZipEntry foodPortion = zipFile.getEntry("food_portion.csv");
        foodPortionList = new CsvDataset<>(new FoodPortion.Builder(), zipFile.getInputStream(foodPortion)).getData();
      }
      return Collections.unmodifiableList(foodPortionList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<FoodComponent> foodComponents() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(foodComponentList == null) {
        ZipEntry foodComponent = zipFile.getEntry("food_component.csv");
        foodComponentList = new CsvDataset<>(new FoodComponent.Builder(), zipFile.getInputStream(foodComponent)).getData();
      }
      return Collections.unmodifiableList(foodComponentList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<AgriculturalAcquisition> agriculturalAcquisitions() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(agriculturalAcquisitionList == null) {
        ZipEntry agriculturalAcquisition = zipFile.getEntry("agricultural_acquisition.csv");
        agriculturalAcquisitionList = new CsvDataset<>(new AgriculturalAcquisition.Builder(), zipFile.getInputStream(agriculturalAcquisition)).getData();
      }
      return Collections.unmodifiableList(agriculturalAcquisitionList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<SurveyFnddsFood> surveyFnddsFoods() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(surveyFnddsFoodList == null) {
        ZipEntry surveyFnddsFood = zipFile.getEntry("survey_fndds_food.csv");
        surveyFnddsFoodList = new CsvDataset<>(new SurveyFnddsFood.Builder(), zipFile.getInputStream(surveyFnddsFood)).getData();
      }
      return Collections.unmodifiableList(surveyFnddsFoodList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<BrandedFood> brandedFoods() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(brandedFoodList == null) {
        ZipEntry brandedFood = zipFile.getEntry("branded_food.csv");
        brandedFoodList = new CsvDataset<>(new BrandedFood.Builder(), zipFile.getInputStream(brandedFood)).getData();
      }
      return Collections.unmodifiableList(brandedFoodList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<FoodUpdateLogEntry> foodUpdateLogEntries() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(foodUpdateLogEntryList == null) {
        ZipEntry foodUpdateLogEntry = zipFile.getEntry("food_update_log_entry.csv");
        foodUpdateLogEntryList = new CsvDataset<>(new FoodUpdateLogEntry.Builder(), zipFile.getInputStream(foodUpdateLogEntry)).getData();
      }
      return Collections.unmodifiableList(foodUpdateLogEntryList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<SrLegacyFood> srLegacyFoods() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(srLegacyFoodList == null) {
        ZipEntry srLegacyFood = zipFile.getEntry("sr_legacy_food.csv");
        srLegacyFoodList = new CsvDataset<>(new SrLegacyFood.Builder(), zipFile.getInputStream(srLegacyFood)).getData();
      }
      return Collections.unmodifiableList(srLegacyFoodList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<FoundationFood> foundationFoods() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(foundationFoodList == null) {
        ZipEntry foundationFood = zipFile.getEntry("foundation_food.csv");
        foundationFoodList = new CsvDataset<>(new FoundationFood.Builder(), zipFile.getInputStream(foundationFood)).getData();
      }
      return Collections.unmodifiableList(foundationFoodList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<SampleFood> sampleFoods() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(sampleFoodList == null) {
        ZipEntry sampleFood = zipFile.getEntry("sample_food.csv");
        sampleFoodList = new CsvDataset<>(new SampleFood.Builder(), zipFile.getInputStream(sampleFood)).getData();
      }
      return Collections.unmodifiableList(sampleFoodList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<SubSampleFood> subSampleFoods() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(subSampleFoodList == null) {
        ZipEntry subSampleFood = zipFile.getEntry("sub_sample_food.csv");
        subSampleFoodList = new CsvDataset<>(new SubSampleFood.Builder(), zipFile.getInputStream(subSampleFood)).getData();
      }
      return Collections.unmodifiableList(subSampleFoodList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<SubSampleResult> subSampleResults() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(subSampleResultList == null) {
        ZipEntry subSampleResult = zipFile.getEntry("sub_sample_result.csv");
        subSampleResultList = new CsvDataset<>(new SubSampleResult.Builder(), zipFile.getInputStream(subSampleResult)).getData();
      }
      return Collections.unmodifiableList(subSampleResultList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<MarketAcquisition> marketAcquisitions() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(marketAcquisitionList == null) {
        ZipEntry marketAcquisition = zipFile.getEntry("market_acquisition.csv");
        marketAcquisitionList = new CsvDataset<>(new MarketAcquisition.Builder(), zipFile.getInputStream(marketAcquisition)).getData();
      }
      return Collections.unmodifiableList(marketAcquisitionList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<AcquisitionSample> acquisitionSamples() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(acquisitionSampleList == null) {
        ZipEntry acquisitionSample = zipFile.getEntry("acquisition_sample.csv");
        acquisitionSampleList = new CsvDataset<>(new AcquisitionSample.Builder(), zipFile.getInputStream(acquisitionSample)).getData();
      }
      return Collections.unmodifiableList(acquisitionSampleList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<InputFood> inputFoods() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(inputFoodList == null) {
        ZipEntry inputFood = zipFile.getEntry("input_food.csv");
        inputFoodList = new CsvDataset<>(new InputFood.Builder(), zipFile.getInputStream(inputFood)).getData();
      }
      return Collections.unmodifiableList(inputFoodList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<FoodAttribute> foodAttributes() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(foodAttributeList == null) {
        ZipEntry foodAttribute = zipFile.getEntry("food_attribute.csv");
        foodAttributeList = new CsvDataset<>(new FoodAttribute.Builder(), zipFile.getInputStream(foodAttribute)).getData();
      }
      return Collections.unmodifiableList(foodAttributeList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<FoodCalorieConversionFactor> foodCalorieConversionFactors() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(foodCalorieConversionFactorList == null) {
        ZipEntry foodCalorieConversionFactor = zipFile.getEntry("food_calorie_conversion_factor.csv");
        foodCalorieConversionFactorList = new CsvDataset<>(new FoodCalorieConversionFactor.Builder(), zipFile.getInputStream(foodCalorieConversionFactor)).getData();
      }
      return Collections.unmodifiableList(foodCalorieConversionFactorList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<FoodProteinConversionFactor> foodProteinConversionFactors() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(foodProteinConversionFactorList == null) {
        ZipEntry foodProteinConversionFactor = zipFile.getEntry("food_protein_conversion_factor.csv");
        foodProteinConversionFactorList = new CsvDataset<>(new FoodProteinConversionFactor.Builder(), zipFile.getInputStream(foodProteinConversionFactor)).getData();
      }
      return Collections.unmodifiableList(foodProteinConversionFactorList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }

  public static List<FoodNutrientConversionFactor> foodNutrientConversionFactors() {
    try (ZipFile zipFile = ZipLoader.load())
    {
      if(foodNutrientConversionFactorList == null) {
        ZipEntry foodNutrientConversionFactor = zipFile.getEntry("food_nutrient_conversion_factor.csv");
        foodNutrientConversionFactorList = new CsvDataset<>(new FoodNutrientConversionFactor.Builder(), zipFile.getInputStream(foodNutrientConversionFactor)).getData();
      }
      return Collections.unmodifiableList(foodNutrientConversionFactorList);
    }
    catch(IOException e){
      throw new IllegalStateException(e);
    }
  }
}
