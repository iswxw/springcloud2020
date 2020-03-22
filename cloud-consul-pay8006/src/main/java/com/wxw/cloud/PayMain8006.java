package com.wxw.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: wxw
 * @create: 2020-03-22-10:17
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PayMain8006 {
    public static void main(String[] args) {
        SpringApplication.run(PayMain8006.class, args);
    }
}
