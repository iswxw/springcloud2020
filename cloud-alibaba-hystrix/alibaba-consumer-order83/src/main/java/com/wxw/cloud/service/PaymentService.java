package com.wxw.cloud.service;

import com.wxw.cloud.domain.Payment;
import com.wxw.cloud.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @auther wxw
 * @create 2020-02-25 18:15
 */
@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService
{
    @GetMapping("/paymentSQL/{id}")
    public Result<Payment> paymentSQL(@PathVariable("id") Long id);
}
