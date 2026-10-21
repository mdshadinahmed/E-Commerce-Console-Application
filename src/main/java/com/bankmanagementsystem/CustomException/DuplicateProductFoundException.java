package com.bankmanagementsystem.CustomException;

public class DuplicateProductFoundException extends RuntimeException {
    public DuplicateProductFoundException(String message) {
        super(message);
    }
}
