package com.practice.protectedapp.dto;

import java.util.Set;

import com.practice.protectedapp.entity.Role;

import lombok.*;


/*
 * register request dto 
 */

 @Getter
 @Setter
 @AllArgsConstructor
 @NoArgsConstructor
public class RegisterRequestDto {
    private String fullName;
    private String email;
    private String password;
    private Set<Role> roles;
}
