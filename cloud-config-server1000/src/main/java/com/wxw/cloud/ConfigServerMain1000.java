package com.wxw.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ Author ：wxw.
 * @ Date ： 13:30 2020/6/7
 * @ Description：总线控制服务端
 * @ Version:   v_0.0.1
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableConfigServer
public class ConfigServerMain1000 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerMain1000.class,args);
    }
}
