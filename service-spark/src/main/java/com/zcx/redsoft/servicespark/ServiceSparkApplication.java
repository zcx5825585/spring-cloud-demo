package com.zcx.redsoft.servicespark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
public class ServiceSparkApplication {

    public static void main(String[] args) {
        System.setProperty("hadoop.home.dir", "d:\\hadoop/hadoop-2.6.5");
        SpringApplication.run(ServiceSparkApplication.class, args);
        System.out.println("started");
    }
}
