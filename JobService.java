package com.jobportal.service;

import com.jobportal.entity.JobPost;
import java.util.List;

public interface JobService {
    JobPost create(JobPost job);
    List<JobPost> getApprovedJobs();
    JobPost getById(Long id);
}
