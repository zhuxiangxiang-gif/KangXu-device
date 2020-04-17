package com.kangxu.device;

import com.kangxu.device.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author: zxx
 * @create: 2020-04-16 16:25
 **/
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }


}
