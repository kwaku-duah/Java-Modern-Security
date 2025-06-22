package com.practice.protectedapp.service;

import com.practice.protectedapp.dto.AuthResponsetDto;
import com.practice.protectedapp.dto.LoginRequestDto;
import com.practice.protectedapp.dto.RegisterRequestDto;


/*
 * auth interface to define the methods that we are going to implement
 */

public interface AuthService {
    AuthResponsetDto register(RegisterRequestDto dto);
    AuthResponsetDto login(LoginRequestDto dto);
}
