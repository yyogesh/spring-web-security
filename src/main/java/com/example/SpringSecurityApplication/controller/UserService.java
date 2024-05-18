package com.example.SpringSecurityApplication.controller;

import com.example.SpringSecurityApplication.dao.UserRepository;
import com.example.SpringSecurityApplication.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
