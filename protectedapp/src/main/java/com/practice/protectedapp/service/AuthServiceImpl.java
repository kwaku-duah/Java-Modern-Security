package com.practice.protectedapp.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.practice.protectedapp.dto.LoginRequestDto;
import com.practice.protectedapp.dto.RegisterRequestDto;
import com.practice.protectedapp.dto.TokenResponse;
import com.practice.protectedapp.repository.UserRepository;

import lombok.RequiredArgsConstructor;

/*
 * authservice interface implementation
 * this is a service class and depends on the Repository layer
 * and I always want do constructor injection so requiredargsconstructor
 * 
 */

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    /*
     * constructor injection for repository
     */
    private final UserRepository repository;

    /*
     * constructor injection for bcrypt password encoder
     */
    private final BCryptPasswordEncoder passwordEncoder;


    @Override
    public TokenResponse register(RegisterRequestDto dto){

    }

    @Override
    public TokenResponse login(LoginRequestDto dto) {
        
    }
}
