package com.wxw.cloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.wxw.cloud.result.Result;

/**
 * @Author: wxw
 * @create: 2020-06-22-21:54
 */
public class CustomerBlockHandler {
    public static Result handlerException1(BlockException exception){
        return new Result(444, "客户自定义global handlerException 限流处理类-----1");
    }

    public static Result handlerException2(BlockException exception){
        return new Result(444, "客户自定义global handlerException 限流处理类-----2");
    }
}
