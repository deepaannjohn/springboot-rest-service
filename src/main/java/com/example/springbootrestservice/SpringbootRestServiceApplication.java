package com.example.springbootrestservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootRestServiceApplication {

    private String s = "Hello World!!";
    public static void main(String[] args) {
        SpringApplication.run(SpringbootRestServiceApplication.class, args);
    }

    @GetMapping("/greet")
    public String greet(String[] args) {
        return s;
    }

}
