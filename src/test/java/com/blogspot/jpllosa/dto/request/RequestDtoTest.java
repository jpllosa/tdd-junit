package com.blogspot.jpllosa.dto.request;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import tools.jackson.databind.ObjectMapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class RequestDtoTest {

    @Test
    public void customerIdNumberToString() {
        String jsonInput = "{\"customerId\":12345}";

        RequestDto dto = new ObjectMapper().readValue(jsonInput, RequestDto.class);

        assertNotNull(dto.getCustomerId());
        assertEquals("12345", dto.getCustomerId());
    }

    @Test
    public void customerIdMaintainedAsString() {
        String jsonInput = "{\"customerId\":\"dev1-12345\"}";

        RequestDto dto = new ObjectMapper().readValue(jsonInput, RequestDto.class);

        assertNotNull(dto.getCustomerId());
        assertEquals("dev1-12345", dto.getCustomerId());
    }
}
