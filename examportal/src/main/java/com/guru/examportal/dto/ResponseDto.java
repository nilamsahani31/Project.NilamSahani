package com.guru.examportal.dto;



public class ResponseDto {

    Boolean isSuccess;
    Object object;
    String Message;

    public ResponseDto(Boolean isSuccess, Object object, String message) {
        this.isSuccess = isSuccess;
        this.object = object;
        Message = message;
    }

    public ResponseDto() {
    }

    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    @Override
    public String toString() {
        return "ResponseDto{" +
                "isSuccess=" + isSuccess +
                ", object=" + object +
                ", Message='" + Message + '\'' +
                '}';
    }
}
