package org.immersed.fooddatacentral;

import java.time.*;
import java.util.*;
import java.util.Map.*;
import java.util.function.*;

public class ReturnTypeGuesser
{
    private static final Map<Class<?>, Predicate<String>> CHECKERS = new LinkedHashMap<>();

    private static Predicate<String> safe(Function<String, ?> function)
    {
        return columnValue ->
        {
            try
            {
                function.apply(columnValue);
                return true;
            }
            catch (RuntimeException e)
            {
                return false;
            }
        };
    }

    static
    {
        CHECKERS.put(int.class, safe(Integer::parseInt));
        CHECKERS.put(long.class, safe(Long::parseLong));
        CHECKERS.put(double.class, safe(Double::parseDouble));
        CHECKERS.put(LocalDate.class, safe(LocalDate::parse));
        CHECKERS.put(String.class, s -> true);
    }

    private Map<Class<?>, Boolean> valid = new LinkedHashMap<Class<?>, Boolean>();

    public ReturnTypeGuesser()
    {
        CHECKERS.keySet()
                .forEach(k -> valid.put(k, true));
    }

    public void updateState(String value)
    {
        if (value == null)
        {
            return;
        }

        for (Entry<Class<?>, Boolean> entry : valid.entrySet())
        {
            Class<?> key = entry.getKey();
            Predicate<String> checker = CHECKERS.get(key);
            boolean currentState = entry.getValue();
            entry.setValue(currentState && checker.test(value));
        }
    }

    public Class<?> bestMatch()
    {
        for (Entry<Class<?>, Boolean> entry : valid.entrySet())
        {
            if (Boolean.TRUE.equals(entry.getValue()))
            {
                return entry.getKey();
            }
        }

        return Object.class;
    }
}
