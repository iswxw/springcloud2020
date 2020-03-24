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
public class OrderFeignMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain.class,args);
    }
}
