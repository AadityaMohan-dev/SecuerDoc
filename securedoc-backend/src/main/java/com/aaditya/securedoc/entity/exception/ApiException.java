package com.aaditya.securedoc.entity.exception;

public class ApiException extends RuntimeException{
    public ApiException(String message) {super(message);}
    public ApiException() {super("An Error occurred");}
}
