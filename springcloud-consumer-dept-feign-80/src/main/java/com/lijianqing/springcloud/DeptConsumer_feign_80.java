package com.lijianqing.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.lijianqing.springcloud")
public class DeptConsumer_feign_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_feign_80.class, args);
    }
}
