package com.practice.protectedapp.service;

import java.util.List;

import com.practice.protectedapp.entity.User;

/*
 * jwt service placed in service folder, because it will be used in 
 * dependency injection
 * and it provides core business logic for token generation
 * 
 * Indication to spring to create and manage its lifecycle
 * Makes it eligible for dependency injection
 * 
 * so username is literally a spring identifier, placeholder for a login 
 * identifier, it just semantics 
 * so if it is supplied with string email,it will return email, etc
 * 
 */


public interface JwtService {
    User generateToken(User user);
    String extractUsername(String token);
    List<String> extractRoles(String token);
    boolean isValid(String token);
}
