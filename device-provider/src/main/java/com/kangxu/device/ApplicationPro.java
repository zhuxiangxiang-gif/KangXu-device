package com.kangxu.device;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: zxx
 * @create: 2020-04-14 22:15
 **/
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.kangxu.device.mapper")
public class ApplicationPro {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationPro.class,args);
    }
}
