package com.practice.protectedapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.protectedapp.entity.User;

/*
 * database interface connection for the user entity
 */

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);
}
