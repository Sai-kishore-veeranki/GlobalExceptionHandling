package com.vsk.ExceptionHandling.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {
        super(message);//which call the runtime exception
    }
}
