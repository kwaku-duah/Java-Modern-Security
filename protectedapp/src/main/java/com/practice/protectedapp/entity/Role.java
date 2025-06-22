package com.practice.protectedapp.entity;

/*
 * role enum to define all available roles and for role based access control
 * using recommended spring security protocol
 */

public enum Role {
    ROLE_ADMIN,
    ROLE_NORMAL,
    ROLE_EXECUTIVE
}
