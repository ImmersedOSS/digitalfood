package org.immersed.fooddatacentral;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.function.Function;
import java.util.function.Predicate;

import com.google.common.base.Preconditions;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;

public class DataObjectReturnTypeGuesser
{
    private static class Checker implements Predicate<String>
    {
        private final Function<String, ?> checker;
        private final Class<?> type;

        public Checker(Class<?> type, Function<String, ?> function)
        {
            this.checker = function;
            this.type = type;
        }

        @Override
        public boolean test(String columnValue)
        {
            try
            {
                checker.apply(columnValue);
                return true;
            }
            catch (RuntimeException e)
            {
                return false;
            }
        }
    }

    private static final List<Checker> CHECKERS = new ArrayList<>();

    private static final Map<Class<?>, Class<?>> OPTIONAL_TYPES = new HashMap<>();

    static
    {
        CHECKERS.add(new Checker(String.class, s ->
        {
            throw new IllegalStateException();
        }));
        CHECKERS.add(new Checker(boolean.class, s ->
        {
            Preconditions.checkState(s.equalsIgnoreCase("Y") || s.equalsIgnoreCase("N"));
            return true;
        }));

        CHECKERS.add(new Checker(int.class, Integer::parseInt));
        CHECKERS.add(new Checker(long.class, Long::parseLong));
        CHECKERS.add(new Checker(double.class, Double::parseDouble));
        CHECKERS.add(new Checker(LocalDate.class, LocalDate::parse));
        CHECKERS.add(new Checker(String.class, s -> s));

        OPTIONAL_TYPES.put(int.class, OptionalInt.class);
        OPTIONAL_TYPES.put(long.class, OptionalLong.class);
        OPTIONAL_TYPES.put(double.class, OptionalDouble.class);
    }

    private Map<Checker, Boolean> valid = new LinkedHashMap<>();
    private boolean optional = false;

    public DataObjectReturnTypeGuesser()
    {
        CHECKERS.stream()
                .forEach(k -> valid.put(k, true));
    }

    public void updateState(String value)
    {
        if (value == null)
        {
            this.optional = true;
            return;
        }

        for (Entry<Checker, Boolean> entry : valid.entrySet())
        {
            Checker checker = entry.getKey();
            boolean currentState = entry.getValue();
            entry.setValue(currentState && checker.test(value));
        }
    }

    public TypeName bestMatch()
    {
        for (Entry<Checker, Boolean> entry : valid.entrySet())
        {
            if (entry.getValue()
                     .booleanValue())
            {
                Checker checker = entry.getKey();
                Class<?> type = checker.type;

                if (optional && OPTIONAL_TYPES.containsKey(type))
                {
                    Class<?> optionalType = OPTIONAL_TYPES.get(type);

                    return TypeName.get(optionalType);
                }
                else if (optional)
                {
                    return ParameterizedTypeName.get(Optional.class, type);
                }

                return TypeName.get(type);
            }
        }

        return TypeName.VOID;
    }
}
