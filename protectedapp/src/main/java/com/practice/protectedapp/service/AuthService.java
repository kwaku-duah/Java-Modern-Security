package com.practice.protectedapp.service;

import com.practice.protectedapp.dto.LoginRequestDto;
import com.practice.protectedapp.dto.RegisterRequestDto;
import com.practice.protectedapp.dto.TokenResponse;

/*
 * auth interface to define the methods that we are going to implement
 */

public interface AuthService {
    TokenResponse register(RegisterRequestDto dto);
    TokenResponse login(LoginRequestDto dto);
}
