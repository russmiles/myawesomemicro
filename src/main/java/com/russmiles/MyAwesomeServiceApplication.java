package com.russmiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class MyAwesomeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyAwesomeServiceApplication.class, args);
    }
}
