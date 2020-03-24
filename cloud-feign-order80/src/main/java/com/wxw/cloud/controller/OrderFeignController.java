package com.wxw.cloud.controller;

import com.wxw.cloud.domain.Person;
import com.wxw.cloud.result.Result;
import com.wxw.cloud.rpc.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: wxw
 * @create: 2020-03-24-20:56
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment")
    public Result<Person> getTestObject(){
        return paymentFeignService.getTestObject();
    }
   // 超时控制
    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        // 客户端默认等待1秒钟
        return paymentFeignService.paymentFeignTimeout();
    }


}
