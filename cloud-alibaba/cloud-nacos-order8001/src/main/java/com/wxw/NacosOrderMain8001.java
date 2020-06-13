package com.wxw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: wxw
 * @create: 2020-06-13-14:43
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosOrderMain8001 {
    public static void main(String[] args)
    {
        SpringApplication.run(NacosOrderMain8001.class,args);
    }

}
