package com.example.SpringSecurityApplication.dao;

import com.example.SpringSecurityApplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
