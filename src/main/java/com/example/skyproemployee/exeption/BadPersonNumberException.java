package com.example.skyproemployee.exeption;

public class BadPersonNumberException extends RuntimeException{
  public BadPersonNumberException(String message) {
       super(message);
    }
}
//private String detail;
//
//    public WrongPasswordException() {
//        detail = "Incorrect password";
//    }
//
//    public WrongPasswordException(String message) {
//        super(message);
//
//        detail = message;
//    }
//
//    @Override
//    public String toString() {
//        return "WrongPasswordException: " + detail;
//    }