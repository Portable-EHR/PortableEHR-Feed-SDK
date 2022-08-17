package com.portableehr;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateDeserializer extends JsonDeserializer<Date> {
    private static DateTimeFormatter formatter;
    static {
        formatter = new DateTimeFormatterBuilder()
                .append(DateTimeFormatter.ISO_DATE_TIME)
                .optionalStart().appendOffset("+HH:MM", "Z").optionalEnd()
                .optionalStart().appendOffset("+HHmm", "Z").optionalEnd()
                .toFormatter();
    }
    
    @Override
    public Date deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
        return Date.from(Instant.from(formatter.parse(p.getText())));
    }
}
