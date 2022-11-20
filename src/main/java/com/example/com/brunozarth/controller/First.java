package com.example.com.brunozarth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class First {

    @GetMapping("/")
    String teste(){
        return "Hello Docker!";
    }
}
