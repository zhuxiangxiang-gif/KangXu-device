package com.kangxu.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: zxx
 * @create: 2020-04-14 22:40
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurrekApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurrekApplication.class,args);
    }


}
