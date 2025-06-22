package com.practice.protectedapp.service;

import com.practice.protectedapp.dto.LoginRequestDto;
import com.practice.protectedapp.dto.RegisterRequestDto;
import com.practice.protectedapp.dto.TokenResponseDto;

/*
 * auth interface to define the methods that we are going to implement
 */

public interface AuthService {
    TokenResponseDto register(RegisterRequestDto dto);
    TokenResponseDto login(LoginRequestDto dto);
}
