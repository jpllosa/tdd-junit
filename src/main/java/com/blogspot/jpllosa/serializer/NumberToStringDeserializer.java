package com.blogspot.jpllosa.serializer;

import tools.jackson.core.JsonParser;
import tools.jackson.core.JsonToken;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.deser.std.StdDeserializer;

public class NumberToStringDeserializer extends StdDeserializer<String> {

    public NumberToStringDeserializer() {
        super(String.class);
    }

    @Override
    public String deserialize(JsonParser parser, DeserializationContext context) {
        JsonToken token = parser.currentToken();

        if (token == JsonToken.VALUE_NULL) {
            return null;
        }

        if (token == JsonToken.VALUE_STRING) {
            return parser.getString();
        }

        if (token == JsonToken.VALUE_NUMBER_INT) {
            return parser.getNumberValue().toString();
        }

        // anything else
        return (String) context.handleUnexpectedToken(String.class, parser);
    }
}
