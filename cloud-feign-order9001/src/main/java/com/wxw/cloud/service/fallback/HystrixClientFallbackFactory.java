package com.wxw.cloud.service.fallback;

import com.wxw.cloud.domain.Person;
import com.wxw.cloud.result.Result;
import com.wxw.cloud.service.PaymentFeignService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author: wxw
 * @date: 2021-01-01-15:46
 * @description:
 */
@Component
public class HystrixClientFallbackFactory implements FallbackFactory<PaymentFeignService> {
    @Override
    public PaymentFeignService create(Throwable throwable) {
        return new PaymentFeignService() {
            @Override
            public Result<Person> getTestObject() {
                return null;
            }

            @Override
            public String paymentFeignTimeout() {
                return "fallback; reason was: " + throwable.getMessage();
            }

            @Override
            public String fallback() {
                return "fallback; reason was: " + throwable.getMessage();
            }

        };
    }
}
