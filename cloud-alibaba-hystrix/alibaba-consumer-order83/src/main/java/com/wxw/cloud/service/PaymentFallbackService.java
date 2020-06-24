package com.wxw.cloud.service;


import com.wxw.cloud.domain.Payment;
import com.wxw.cloud.result.Result;
import org.springframework.stereotype.Component;

/**
 * @auther wxw
 * @create 2020-02-25 18:30
 */
@Component
public class PaymentFallbackService implements PaymentService {

    @Override
    public Result<Payment> paymentSQL(Long id) {
        return new Result<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
