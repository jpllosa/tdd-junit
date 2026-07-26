package com.blogspot.jpllosa.dto.response;

import com.blogspot.jpllosa.serializer.StringToNumberSerializer;
import tools.jackson.databind.annotation.JsonSerialize;

public class ResponseDto {
    @JsonSerialize(using = StringToNumberSerializer.class)
    private String transactionId;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "ResponseDto{" +
                "transactionId='" + transactionId + '\'' +
                '}';
    }
}
