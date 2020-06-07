package com.wxw.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ Author ：wxw.
 * @ Date ： 15:40 2020/6/7
 * @ Description：配置总线客户端
 * @ Version:   v_0.0.1
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientMain1001 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain1001.class,args);
    }
}
