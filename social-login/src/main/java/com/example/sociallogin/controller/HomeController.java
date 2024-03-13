package com.example.sociallogin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
    @GetMapping("/")
    public String home(){
        return "Welcome to Home Page!!!";
    }
    @GetMapping("/secured")
    public String secured(){
        return "Welcome to Secured Page!!!";
    }

}
