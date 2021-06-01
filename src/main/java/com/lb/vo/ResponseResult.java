package com.lb.vo;

import lombok.Data;


@Data
public class ResponseResult {
    private String code;
    private String message;
    private String data;

    public ResponseResult() {}

    public ResponseResult(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
