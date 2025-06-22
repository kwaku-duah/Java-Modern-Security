package com.practice.protectedapp.service;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.practice.protectedapp.dto.*;
import com.practice.protectedapp.entity.User;
import com.practice.protectedapp.exception.*;
import com.practice.protectedapp.repository.UserRepository;
import com.practice.protectedapp.security.JwtService;

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
    private final UserRepository userRepository;

    /*
     * constructor injection for bcrypt password encoder
     */
    private final BCryptPasswordEncoder passwordEncoder;

    /*
     * constructor injection for Jwt service
     */
    private final JwtService jwtService;


    @Override
    public AuthResponsetDto register(RegisterRequestDto dto){
        if(userRepository.findByEmail(dto.getEmail()).isPresent()) {
            throw new DuplicateResourceException("Email already exists");
        }

        User registerUser = new User();
        registerUser.setFullName(dto.getFullName());
        registerUser.setEmail((dto.getEmail()));
        registerUser.setPassword(passwordEncoder.encode(dto.getPassword()));
        registerUser.setRoles(dto.getRoles());

        userRepository.save(registerUser);

        String token = jwtService.generateToken(registerUser);
        String refreshToken = jwtService.generateRefreshToken(registerUser);

        AuthResponsetDto response = new AuthResponsetDto();
        response.setFullName(registerUser.getFullName());
        response.setEmail(registerUser.getEmail());
        response.setRoles(registerUser.getRoles());
        response.setAccessToken(token);
        response.setRefreshToken(refreshToken);

        return response;

    }

    @Override
    public AuthResponsetDto login(LoginRequestDto dto) {
        User user = userRepository.findByEmail(dto.getEmail())
            .orElseThrow(()-> new ResourceNotFoundException("User", "email", dto.getEmail()));

        if (!passwordEncoder.matches(dto.getPassword(), user.getPassword())) {
            throw new InvalidCredentialException("Invalid Password");
        }

        String token = jwtService.generateToken(user);
        String refreshToken = jwtService.generateRefreshToken(user);
        AuthResponsetDto response = new AuthResponsetDto();
        response.getFullName();
        response.getEmail();
        response.getRoles();
        response.setAccessToken(token);
        response.setRefreshToken(refreshToken);

        return response;

        
    }
}
