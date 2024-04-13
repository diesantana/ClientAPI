package com.devsuperior.ClientAPI.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationErrorDTO extends CustomErrorDTO{
    private List<FieldMessage> messageList = new ArrayList<>();

    public ValidationErrorDTO(Instant timestamp, Integer status, String error, String path) {
        super(timestamp, status, error, path);
    }

    public List<FieldMessage> getMessageList() {
        return messageList;
    }
    
    public void addFieldMessage(String fieldName,String message) {
        messageList.add(new FieldMessage(fieldName, message));
    }
}
