package com.wxw.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: wxw
 * @create: 2020-06-22-22:33
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class ConsumerOrderMain84 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrderMain84.class, args);
    }

}
