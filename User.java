package com.jobportal.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password; // stored encrypted

    @Enumerated(EnumType.STRING)
    private Role role;

    private String resumeUrl; // optional for job seekers

    // getters and setters
    // constructors
}
