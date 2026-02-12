package com.poc.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    @Value("${db.username}")
    private String dbUsername;

    @Value("${db.password}")
    private String dbPassword;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @PostConstruct
    public void checkSecrets() {
        if (dbUsername != null && dbPassword != null) {
            System.out.println("✅ Secrets loaded successfully");
        } else {
            System.out.println("❌ Secrets missing");
        }
    }
}
