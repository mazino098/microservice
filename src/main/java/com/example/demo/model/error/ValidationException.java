package com.example.demo.model.error;

public class ValidationException extends RuntimeException{
    public ValidationException(String message) {
        super(message);
    }
}
