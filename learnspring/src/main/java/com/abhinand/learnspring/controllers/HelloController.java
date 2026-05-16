package com.abhinand.learnspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/api/home")
    public String hello(){
        return "Welcome to springboot";
    }
}