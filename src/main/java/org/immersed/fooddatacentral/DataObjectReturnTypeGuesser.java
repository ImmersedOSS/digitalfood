package org.immersed.fooddatacentral;

import java.time.*;
import java.util.*;
import java.util.Map.*;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

import com.google.common.base.*;
import com.squareup.javapoet.*;

public class DataObjectReturnTypeGuesser
{
    private static class Checker implements Predicate<String>
    {
        private final Function<String, ?> checker;
        private final Class<?> type;
        private boolean optional = false;

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

        public TypeName getType()
        {
            if (optional)
            {
                return ParameterizedTypeName.get(Optional.class, type);
            }

            return TypeName.get(type);
        }
    }

    private static final List<Checker> CHECKERS = new ArrayList<>();

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
    }

    private Map<Checker, Boolean> valid = new LinkedHashMap<>();

    public DataObjectReturnTypeGuesser()
    {
        CHECKERS.stream()
                .forEach(k -> valid.put(k, true));
    }

    public void updateState(String value)
    {
        for (Entry<Checker, Boolean> entry : valid.entrySet())
        {
            if (value == null)
            {
                entry.getKey().optional = true;
                return;
            }

            Checker checker = entry.getKey();
            boolean currentState = entry.getValue();
            entry.setValue(currentState && checker.test(value));
        }
    }

    public TypeName bestMatch()
    {
        for (Entry<Checker, Boolean> entry : valid.entrySet())
        {
            if (Boolean.TRUE.equals(entry.getValue()))
            {
                Checker checker = entry.getKey();
                return checker.getType();
            }
        }

        return TypeName.VOID;
    }
}
