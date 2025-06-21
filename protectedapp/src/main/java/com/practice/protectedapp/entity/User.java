package practice.protectedapp.entity;

import lombok.*;

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
}
