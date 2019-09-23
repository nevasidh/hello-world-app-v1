package com.demo.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldAppV1 {

    public static void main(String args[]){
        SpringApplication.run(HelloWorldAppV1.class, args );
        System.out.println("APPLICATION STARTED");
    }
}

