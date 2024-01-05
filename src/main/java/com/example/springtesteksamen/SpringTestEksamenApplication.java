package com.example.springtesteksamen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringTestEksamenApplication {
    @GetMapping("/message")
    public String message(){
        return"deployed to azure!!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringTestEksamenApplication.class, args);
    }

}
