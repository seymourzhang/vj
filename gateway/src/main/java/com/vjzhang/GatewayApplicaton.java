package com.vjzhang;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplicaton {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplicaton.class, args);
    }
}