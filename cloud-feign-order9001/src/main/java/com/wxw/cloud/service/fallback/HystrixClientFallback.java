package com.wxw.cloud.service.fallback;

import com.wxw.cloud.domain.Person;
import com.wxw.cloud.result.Result;
import com.wxw.cloud.service.PaymentFeignService;
import org.springframework.stereotype.Component;

/**
 * @author: wxw
 * @date: 2021-01-01-15:34
 * @description:
 */
@Component
public class HystrixClientFallback implements PaymentFeignService {

    @Override
    public Result<Person> getTestObject() {
        return null;
    }

    @Override
    public String paymentFeignTimeout() {
        return null;
    }

    @Override
    public String fallback() {
        String result = "当它们的电路断开或出现错误时执行的默认代码路径!!";
        return result;
    }
}
