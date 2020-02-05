package org.immersed.fooddatacentral;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class OptionalSupport
{
    private OptionalSupport()
    {
    }

    public static final OptionalInt parseInt(String value)
    {
        try
        {
            return OptionalInt.of(Integer.parseInt(value));
        }
        catch (RuntimeException e)
        {
            return OptionalInt.empty();
        }
    }

    public static final OptionalLong parseLong(String value)
    {
        try
        {
            return OptionalLong.of(Long.parseLong(value));
        }
        catch (RuntimeException e)
        {
            return OptionalLong.empty();
        }
    }

    public static final OptionalDouble parseDouble(String value)
    {
        try
        {
            return OptionalDouble.of(Double.parseDouble(value));
        }
        catch (RuntimeException e)
        {
            return OptionalDouble.empty();
        }
    }
}
