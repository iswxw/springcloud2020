package com.wxw.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: wxw
 * @create: 2020-06-22-22:22
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderMain9004 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderMain9004.class, args);
    }

}
