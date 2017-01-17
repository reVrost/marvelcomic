package com.marvelcomic;

public class ErrorResult {

    private final long code;
    private final String message;

    public ErrorResult(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}