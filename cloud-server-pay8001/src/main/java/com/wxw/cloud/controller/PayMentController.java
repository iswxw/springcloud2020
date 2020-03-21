package com.wxw.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: wxw
 * @create: 2020-03-21-15:09
 */
@Slf4j
@RestController
public class PayMentController {

    // 服务发现注册中心的服务信息
    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/discovery")
    public void discoveryTest(){
        List<String> services = discoveryClient.getServices();
        services.forEach(application -> log.info("应用信息=>{}",application));
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-ORDER-SERVICE");
        instances.forEach(instance -> log.info("服务实例=>{}", instance));
    }


}
