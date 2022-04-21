package com.projects.tmhservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeResource {

    @GetMapping("welcome")
    public String welcome() {
        return "Welcome to Take My Hand !!!!";
    }
}
