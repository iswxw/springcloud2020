package com.wxw.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: wxw
 * @create: 2020-03-24-22:48
 */
@EnableEurekaClient
@SpringBootApplication
public class HyStrixPayMain8001 {

    public static void main(String[] args) {
        SpringApplication.run(HyStrixPayMain8001.class, args);
    }
}
