package com.wxw.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: wxw
 * @create: 2020-03-24-20:44
 */
@EnableFeignClients
@SpringBootApplication
public class OrderFeignMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain9001.class,args);
    }
}
