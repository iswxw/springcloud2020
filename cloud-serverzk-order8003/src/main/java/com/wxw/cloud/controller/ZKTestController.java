package com.wxw.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: wxw
 * @create: 2020-03-21-18:24
 */
@Slf4j
@RestController
public class ZKTestController {
    // 8004的应用
    public static final String INVOME_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/zkconsumer")
    public String payment (){
        String result = restTemplate.getForObject(INVOME_URL+"/findzkport",String.class);
        return result;
    }

}
