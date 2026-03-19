package com.example.poc.controller;

import com.example.poc.config.DbConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final DbConfig dbConfig;

    public TestController(DbConfig dbConfig) {
        this.dbConfig = dbConfig;
    }

    @GetMapping("/paratest")
    public String test() {
        return "Username: " + dbConfig.getUsername() +
               " | Password: " + dbConfig.getPassword();
    }
}
