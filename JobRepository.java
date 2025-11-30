package com.jobportal.repository;

import com.jobportal.entity.JobPost;
import com.jobportal.entity.JobPost.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface JobRepository extends JpaRepository<JobPost, Long> {
    List<JobPost> findByStatus(Status status);
    List<JobPost> findByTitleContainingIgnoreCaseOrSkillsContainingIgnoreCase(String title, String skills);
}
