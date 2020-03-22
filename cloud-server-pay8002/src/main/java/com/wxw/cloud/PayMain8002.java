package com.wxw.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: wxw
 * @create: 2020-03-22-18:51
 */
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class PayMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PayMain8002.class, args);
    }
}
