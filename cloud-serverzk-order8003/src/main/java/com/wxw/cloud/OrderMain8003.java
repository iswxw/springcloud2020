package com.wxw.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: wxw
 * @create: 2020-03-21-17:38
 */
//用于向使用consul或zookeeper作为注册中心注册服务
@EnableDiscoveryClient
@SpringBootApplication
public class OrderMain8003 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain8003.class, args);
    }
}
