package com.wxw.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: wxw
 * @create: 2020-03-22-10:33
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain8005 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain8005.class, args);
    }
}
