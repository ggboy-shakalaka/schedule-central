package com.ggboy.sdc.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = {"com.ggboy.sdc.**"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}