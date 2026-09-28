package com.bankmanagementsystem.CustomException;

public class DuplicateCustomerFoundException extends RuntimeException {
    public DuplicateCustomerFoundException(String message) {
        super(message);
    }
}
