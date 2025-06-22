package com.practice.protectedapp.dto;

import java.util.Set;

import com.practice.protectedapp.entity.Role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 * authResponse dto to hold all required fields to the frontend
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponsetDto {
    private String fullName;
    private String email;
    private Set<Role> roles;
    private String accessToken;
    private String refreshToken;
}
