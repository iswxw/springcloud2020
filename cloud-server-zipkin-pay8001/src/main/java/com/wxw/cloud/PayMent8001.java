package com.wxw.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: wxw
 * @create: 2020-03-19-16:48
 * 支付模块入口
 */
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class PayMent8001 {
    public static void main(String[] args) {
        SpringApplication.run(PayMent8001.class, args);
    }
}
