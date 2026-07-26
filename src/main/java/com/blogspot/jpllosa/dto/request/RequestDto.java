package com.blogspot.jpllosa.dto.request;

import com.blogspot.jpllosa.serializer.NumberToStringDeserializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import tools.jackson.databind.annotation.JsonDeserialize;

public class RequestDto {

    // Jackson coerces values in strings. It's worth advocating this explicit approach.
    // makes it clearer to the future developers as to what's going on. Also limit the type
    // to only integers can be coerced.
    @JsonDeserialize(using = NumberToStringDeserializer.class)
    @JsonProperty("customerId")
    private String customerId;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "RequestDto{" +
                "customerId='" + customerId + '\'' +
                '}';
    }
}
