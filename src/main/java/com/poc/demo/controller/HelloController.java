package com.vijay.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/demo") 
public class HelloController {

    @GetMapping("/")
    public String root() {
        return "Root Method from Service1.... Monday.... Task Definition LATEST Checking...";
    }

    @GetMapping("/health")
    public String health() {
        return "Health Method from Service1.... Monday.... Task Definition LATEST Checking...";
    }
}
