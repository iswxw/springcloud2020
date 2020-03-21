package com.wxw.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: wxw
 * @create: 2020-03-21-16:34
 */

//用于向使用consul或zookeeper作为注册中心注册服务
@EnableDiscoveryClient
@SpringBootApplication
public class PayMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PayMain8004.class, args);
    }

}
