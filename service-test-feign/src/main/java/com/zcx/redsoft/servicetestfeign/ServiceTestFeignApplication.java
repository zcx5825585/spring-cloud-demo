package com.zcx.redsoft.servicetestfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceTestFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceTestFeignApplication.class, args);
    }
}
