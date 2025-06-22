package com.practice.protectedapp.dto;

import lombok.*;

/*
 * accepted modern standard should be records to enforce security
 * but I am using class to get to understand spring security
 * 
 for practical tuturials
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequestDto {
    private String email;
    private String password;
}
