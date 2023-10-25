package com.project.app.dto;

import lombok.Data;

@Data
public class ResultDto {
    private Boolean state;
    private Object result;
    private String message;
}
