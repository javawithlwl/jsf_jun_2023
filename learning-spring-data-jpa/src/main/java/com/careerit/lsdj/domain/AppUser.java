package com.careerit.lsdj.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AppUser extends BaseEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="id")
        private Long id;
        @Column(name="username",nullable = false,updatable = false)
        private String username;
        @Column(name="password",nullable = false,updatable = true)
        private String password;
        @Column(name = "email", nullable = false,updatable = true)
        private String email;
}
