package com.practice.protectedapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.protectedapp.dto.AuthResponsetDto;
import com.practice.protectedapp.dto.LoginRequestDto;
import com.practice.protectedapp.dto.RegisterRequestDto;
import com.practice.protectedapp.service.AuthService;

import lombok.RequiredArgsConstructor;

/*
 * controller for web request
 */

@RestController
@RequestMapping("api/auth")
@RequiredArgsConstructor
public class AuthController {

    /*
     * depends on authservice
     */

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<AuthResponsetDto> registerUser(@RequestBody RegisterRequestDto dto) {
        return ResponseEntity.ok(authService.register(dto));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponsetDto> loginUser(@RequestBody LoginRequestDto dto) {
        return ResponseEntity.ok(authService.login(dto));
    }
}
