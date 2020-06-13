package com.wxw.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/*
 * @ClassName OrderNacosController
 * @Author 魏小伟
 * @Date 2020/6/13 14:46
 **/

@Slf4j
@RestController
public class OrderNacosController
{
    @Resource
    private RestTemplate restTemplate;

    // 方式1
    // private static final String Server_URL = "http://nacos-payment-provider";
    // 方式二
    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    // http://localhost:8001/consumer/payment/nacos/2020
    @GetMapping(value = "/consumer/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Long id)
    {
        return restTemplate.getForObject(serverURL+"/payment/nacos/"+id,String.class);
    }

}
 