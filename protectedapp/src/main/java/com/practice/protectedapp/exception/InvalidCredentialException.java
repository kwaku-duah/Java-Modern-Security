package com.practice.protectedapp.exception;

public class InvalidCredentialException extends RuntimeException {
    
    public InvalidCredentialException(String message){
        super(message);
    }
}
