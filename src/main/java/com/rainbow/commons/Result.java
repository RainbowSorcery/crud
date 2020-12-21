package com.rainbow.commons;

public class Result<T> {
    private Integer statusCode;
    private Boolean success;
    private T data;
    private String message;

    public Result(Integer statusCode, Boolean success, String message) {
        this.statusCode = statusCode;
        this.success = success;
        this.message = message;
    }

    public Result(Integer statusCode, Boolean success, T data, String message) {
        this.statusCode = statusCode;
        this.success = success;
        this.data = data;
        this.message = message;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
