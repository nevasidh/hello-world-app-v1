package com.demo.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

    @GetMapping("/")
    public String sayHello() {
        return "Hi. I am Hello-World-App-v1";
    }

}
