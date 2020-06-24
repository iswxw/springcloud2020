package com.wxw.cloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.wxw.cloud.handler.CustomerBlockHandler;
import com.wxw.cloud.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wxw
 * @create: 2020-06-22-21:21
 */
@RestController
public class RateLimitController {

    /**
     * http://localhost:8401/byResource
     * @return
     */
    @GetMapping("/byResource")
    @SentinelResource(value = "byResource",blockHandler = "handleException")
    public Result byResource()
    {
        return new Result(200,"按资源名称限流测试OK");
    }
    public Result handleException(BlockException exception)
    {
        return new Result(444,exception.getClass().getCanonicalName()+"\t 服务不可用");
    }

    /**
     * http://localhost:8401/rateLimit/byUrl
     * 默认异常处理 按url路径配置
     * @return
     */
    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl1")
    public Result byUrl() {
        return new Result(200, "按url限流测试OK");
    }

    /**
     *  业务跟代码逻辑解耦，提高代码的健壮性
     * @return
     */
    // 自定义限流处理类  http://localhost:8401/rateLimit/customerBlockHandler
    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
                     blockHandlerClass = CustomerBlockHandler.class,
                     blockHandler = "handlerException2")
    public Result customerBlockHandler() {
        return new Result(200, "客户自定义限流处理类");
    }



}
