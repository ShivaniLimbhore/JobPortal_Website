//candidate application
package com.jobportal.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private JobPost job;

    @ManyToOne
    private User seeker;

    private String resumeUrl;

    @Enumerated(EnumType.STRING)
    private AppStatus status = AppStatus.APPLIED;

    private LocalDateTime appliedAt = LocalDateTime.now();

    public enum AppStatus { APPLIED, SHORTLISTED, REJECTED }

    // getters and setters
}
