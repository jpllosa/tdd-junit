package com.blogspot.jpllosa.dto.response;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import tools.jackson.databind.ObjectMapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ResponseDtoTest {

    @Test
    public void transactionIdNumberToString() {
        ResponseDto dto = new ResponseDto();
        dto.setTransactionId("54321");

        String expectedJson = "{\"transactionId\":54321}";

        String actualJson = new ObjectMapper().writeValueAsString(dto);

        assertEquals(expectedJson, actualJson);
    }

    @Test
    public void transactionIdMaintainedAsString() {
        ResponseDto dto = new ResponseDto();
        dto.setTransactionId("dev2-54321");

        String expectedJson = "{\"transactionId\":\"dev2-54321\"}";

        String actualJson = new ObjectMapper().writeValueAsString(dto);

        assertEquals(expectedJson, actualJson);
    }
}
