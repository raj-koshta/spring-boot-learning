package com.learning.myFirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstClass {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello From Spring Boot!";
    }
}
