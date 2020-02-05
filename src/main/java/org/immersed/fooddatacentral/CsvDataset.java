package org.immersed.fooddatacentral;

import java.io.*;
import java.util.*;

import com.univocity.parsers.common.*;
import com.univocity.parsers.common.processor.*;
import com.univocity.parsers.csv.*;

public final class CsvDataset<T extends FoodDataBuilder<T, S>, S>
{
    private final class Processor implements RowProcessor
    {
        @Override
        public void processStarted(ParsingContext context)
        {
            // NOOP
        }

        @Override
        public void rowProcessed(String[] row, ParsingContext context)
        {
            if (!Arrays.equals(row, context.headers()))
            {
                data.add(builder.fromCsv(row)
                                .build());
            }
        }

        @Override
        public void processEnded(ParsingContext context)
        {
            // NOOP
        }

    }

    private final FoodDataBuilder<T, S> builder;
    private final List<S> data = new ArrayList<>();

    public CsvDataset(FoodDataBuilder<T, S> builder, InputStream stream)
    {
        this.builder = builder;

        CsvParserSettings settings = Csv.parseRfc4180();
        settings.setProcessor(new Processor());
        CsvParser parser = new CsvParser(settings);
        parser.parse(stream);
    }

    public List<S> getData()
    {
        return Collections.unmodifiableList(data);
    }
}
