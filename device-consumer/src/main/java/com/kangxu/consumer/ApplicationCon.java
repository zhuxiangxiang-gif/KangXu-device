package com.kangxu.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: zxx
 * @create: 2020-04-14 22:29
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.kangxu.consumer.service")
public class ApplicationCon {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationCon.class,args);
    }


}
