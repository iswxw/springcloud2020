package com.wxw.cloud.service.exception;

import com.wxw.cloud.service.PayHystrixRPC;
import org.springframework.stereotype.Component;

/**
 * @Author: wxw
 * @create: 2020-03-25-14:50
 */
@Component
public class PayHystrixRPCException implements PayHystrixRPC {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "Fall back=>PayHystrixRPC=>paymentInfo_OK=>调用成功方法";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "Fall back=>PayHystrixRPC=>paymentInfo_TimeOut=>调用成功方法";
    }
}
