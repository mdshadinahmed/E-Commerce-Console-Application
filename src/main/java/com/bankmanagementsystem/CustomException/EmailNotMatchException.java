package com.bankmanagementsystem.CustomException;

public class EmailNotMatchException extends RuntimeException {
    public EmailNotMatchException(String message) {
        super(message);
    }
}
