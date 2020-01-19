package org.immersed.fooddatacentral;

/**
 * Defines a builder that can be populated from a CSV row.
 * 
 * @author Dan Avila
 *
 * @param <T>
 */
public interface FoodDataBuilder<T>
{
    T fromCsv(String[] row);
}
