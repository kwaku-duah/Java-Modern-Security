package com.practice.protectedapp.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/secure")
public class MethodLevelController {

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String getAdmin() {
        return "Hello Admin, you alone can access this endpoint";
    }

    @GetMapping("/executive")
    @PreAuthorize("hasRole('EXECUTIVE')")
    public String getExecutive() {
        return "Hello Executive, you alone can access this endpoint";
    }

    @GetMapping("/normal")
    @PreAuthorize("hasRole('NORMAL')")
    public String getNormal() {
        return "Hello Normal user, you alone can access this endpoint";
    }
}
