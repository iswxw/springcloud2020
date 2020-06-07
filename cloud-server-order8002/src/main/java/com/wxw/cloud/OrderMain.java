package com.wxw.cloud;

import com.wxw.rule.RuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author: wxw
 * @create: 2020-03-20-0:45
 * RibbonClient  启动自定义的负载均衡机制
 */
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = RuleConfig.class)
@EnableEurekaClient
@SpringBootApplication
public class OrderMain {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain.class, args);
    }
}
