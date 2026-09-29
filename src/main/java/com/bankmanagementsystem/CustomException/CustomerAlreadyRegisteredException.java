package com.bankmanagementsystem.CustomException;

public class CustomerAlreadyRegisteredException extends RuntimeException {
    public CustomerAlreadyRegisteredException(String message) {
        super(message);
    }
}
