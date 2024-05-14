package com.example.SpringSecurityApplication.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("home")
    public String home(HttpServletRequest httpServletRequest){
        return "Home Page Request " + httpServletRequest.getSession().getId();
    }

    @GetMapping("about")
    public String about(HttpServletRequest httpServletRequest){
        return "About Page Request " + httpServletRequest.getSession().getId();
    }
}
