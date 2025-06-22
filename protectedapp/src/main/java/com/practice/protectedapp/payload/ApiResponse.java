package com.practice.protectedapp.payload;


/*
 * record that carries responses for operations
 */

public record ApiResponse(boolean success, String message) {
    
}
