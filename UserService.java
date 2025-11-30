package com.jobportal.service;

import com.jobportal.entity.User;

public interface UserService {
    User register(User user);
    User findByEmail(String email);
}
