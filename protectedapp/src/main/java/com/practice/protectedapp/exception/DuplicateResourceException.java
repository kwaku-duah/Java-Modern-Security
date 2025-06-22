package com.practice.protectedapp.exception;

/*
 * if email already exists, extends runtime, it gets caught and
 * instead of using exception and using throws everywhere, it clutters your code
 */

public class DuplicateResourceException extends RuntimeException {
    
    public DuplicateResourceException(String message) {
        super(message);
    }
}
