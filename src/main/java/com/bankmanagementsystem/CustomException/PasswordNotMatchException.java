package com.bankmanagementsystem.CustomException;

public class PasswordNotMatchException extends RuntimeException {
  public PasswordNotMatchException(String message) {
    super(message);
  }
}
