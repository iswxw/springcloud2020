package com.wxw.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: wxw
 * @create: 2020-06-22-23:55
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderPayMain9004 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderPayMain9004.class, args);
    }

}
