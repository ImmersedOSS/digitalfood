package org.immersed.fooddatacentral;

/**
 * Defines a builder that can be populated from a CSV row.
 * 
 * @author Dan Avila
 *
 * @param <T> the builder type.
 * @param <S> the object type we are building.
 */
public interface FoodDataBuilder<T, S>
{
    /**
     * Populates this builder with the provided row of data.
     * 
     * @param row the row of data.
     * @return this
     */
    T fromCsv(String[] row);

    S build();
}
