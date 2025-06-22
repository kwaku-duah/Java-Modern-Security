package com.practice.protectedapp.exception;


/*
 * custom exception handling for resource not found, such as missing id, email etc
 */

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String resource, String name, Object type){
        super(String.format("%s with %s not found for : %s"));
    }
}
