package com.wxw.cloud.rpc;

import com.wxw.cloud.domain.Person;
import com.wxw.cloud.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "CLOUD-PAYMENT-RPC")
public interface PaymentFeignService {

    @GetMapping("/payment")
    public Result<Person> getTestObject();

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
