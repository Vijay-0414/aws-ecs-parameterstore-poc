package com.poc.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    // These will be injected ONLY from environment variables
    @Value("${DB_USERNAME:}")
    private String dbUsername;

    @Value("${DB_PASSWORD:}")
    private String dbPassword;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @PostConstruct
    public void checkSecrets() {

        if (dbUsername == null || dbUsername.isBlank()
                || dbPassword == null || dbPassword.isBlank()) {

            System.out.println("❌ Secrets missing");

        } else {
            System.out.println("✅ Secrets loaded successfully");
        }
    }
}
