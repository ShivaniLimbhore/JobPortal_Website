package com.jobportal.entity;

import jakarta.persistence.*;

@Entity
public class JobPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String location;
    private Integer experience; // years
    private String skills; // comma separated
    private Integer salary;

    @ManyToOne
    private User recruiter;

    @Enumerated(EnumType.STRING)
    private Status status = Status.PENDING;

    public enum Status { PENDING, APPROVED, REJECTED }

    // getters and setters
}
