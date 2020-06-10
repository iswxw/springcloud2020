package com.wxw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: wxw
 * @create: 2020-06-10-23:18
 */
@EnableEurekaClient
@SpringBootApplication
public class BusMain1002 {
    public static void main(String[] args) {
        SpringApplication.run(BusMain1002.class, args);
    }
}
