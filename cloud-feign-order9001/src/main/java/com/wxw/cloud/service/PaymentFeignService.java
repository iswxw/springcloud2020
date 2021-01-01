package com.wxw.cloud.service;

import com.wxw.cloud.domain.Person;
import com.wxw.cloud.result.Result;
import com.wxw.cloud.service.fallback.HystrixClientFallback;
import com.wxw.cloud.service.fallback.HystrixClientFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "CLOUD-SERVER-PAY",
        fallback = HystrixClientFallback.class)
//        ,fallbackFactory = HystrixClientFallbackFactory.class)
public interface PaymentFeignService {

    @GetMapping("/payment")
    public Result<Person> getTestObject();

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();

    /**
     * 异常时，默认路径  HystrixClientFallback
     * 异常时，返回异常原因  HystrixClientFallbackFactory
     * @return
     */
    @GetMapping(value = "/payment/histrix-fallback")
    public String fallback();

}
