package com.wxw.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: wxw
 * @create: 2020-03-22-10:37
 */
@Slf4j
@RestController
public class ConsulTestController {

    // 8006的应用
    public static final String INVOME_URL = "http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consul_consumer")
    public String payment (){
        String result = restTemplate.getForObject(INVOME_URL+"/findConsulPort",String.class);
        return result;
    }
}
