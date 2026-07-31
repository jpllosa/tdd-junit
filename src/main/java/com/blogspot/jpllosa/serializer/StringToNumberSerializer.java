package com.blogspot.jpllosa.serializer;

import tools.jackson.core.JacksonException;
import tools.jackson.core.JsonGenerator;
import tools.jackson.databind.SerializationContext;
import tools.jackson.databind.ser.std.StdSerializer;

public class StringToNumberSerializer extends StdSerializer<String> {

    public StringToNumberSerializer() {
        super(String.class);
    }

    @Override
    public void serialize(String value, JsonGenerator generator, SerializationContext context) throws JacksonException {
        try {
            generator.writeNumber(Integer.parseInt(value));
        } catch (NumberFormatException e) {
            generator.writeString(value);
        }
    }
}
