package com.practice.protectedapp.entity;

import lombok.*;

import java.util.Set;

import jakarta.persistence.*;;
/*
 * User model/entity for the project 
 */


@Entity
@Table(name = "usertable")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    String fullName;

    @Column(nullable = false, unique = true)
    String email;

    @Column(nullable = false)
    String password;

    @Column(length = 512)
    private String refreshToken;

    /*
     * addition of row field with Set data type for uniqueness
     * JPA cannot store a collection of Set<enum>, so element 
     * collection tells spring to look for this field in another table
     * JPA does not automatically accept this data type as a column
     * 
     * element collection if it is basic type, (string, integer or enum
     *) This tells JPA to create an extra table and join
     * 
     * but if is a collection of type entity, use manytomany so spring joins
     * two entity tables
     * 
     * This is not a column because, it defeats the first normal form of relational
     * databases and that is all columns must hold only atomic values
     */
    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;
}
