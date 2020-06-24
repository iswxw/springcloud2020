package com.wxw.cloud.controller;

import com.wxw.cloud.service.PaymentService;
import com.wxw.cloud.domain.Payment;
import com.wxw.cloud.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @auther wxw
 * @create 2020-02-25 16:05
 */
@RestController
@Slf4j
public class CircleBreakerController {


    //==================OpenFeign==================
    /**
     * http://localhost:83/consumer/openfeign/1
     * 测试降级 ，断掉 9003/9004 是否会降级到本地指定调用接口
     */
    @Resource
    private PaymentService paymentService;

    @GetMapping(value = "/consumer/openfeign/{id}")
    public Result<Payment> paymentSQL(@PathVariable("id") Long id) {
        return paymentService.paymentSQL(id);
    }
}
