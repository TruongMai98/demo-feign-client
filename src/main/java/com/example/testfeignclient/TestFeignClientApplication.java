package com.example.testfeignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TestFeignClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestFeignClientApplication.class, args);
    }

}
