package com.wxw.cloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Author: wxw
 * @create: 2020-06-21-12:51
 */
@RestController
@Slf4j
public class FlowLimitController {

    @Value("${server.port}")
    private String serverPort;

    // 地址：http://localhost:8401/testA
    @GetMapping("/testA")
    public String testA() {
        return "------testA: "+serverPort;
    }

    // 地址：http://localhost:8401/testB
    @GetMapping("/testB")
    public String testB() {
        return "------testB: "+serverPort;
    }

    @GetMapping("/testC")
    public String testC() {
        int age = 10/0;
        log.info("异常时间到,异常比例测试：");
        return "------testC: "+serverPort;
    }

    @GetMapping("/testD")
    public String testD()
    {
        try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
        log.info("testD 测试RT");

        return "------testD";
    }

    @GetMapping("/testE")
    public String testE()
    {
        log.info("testE 测试异常数");
        int age = 10/0;
        return "------testE 测试异常数";
    }

    /**
     * ===================热点key 熔断策略======热点规则===========
     *  http://localhost:8401/testHotHey
     *  http://localhost:8401/testHotHey?p1=a&p2=b
     *
     *  例外项：相当于QPS的白名单
     */
    @GetMapping("/testHotHey")
    @SentinelResource(value = "testHotHey", blockHandler = "deal_testHotHey")
    public String testHotKeyLimit(@RequestParam(value = "p1", required = false) String p1,
                                  @RequestParam(value = "p2", required = false) String p2) {
        return "testHotKey:热点key限流成功";
    }

    // 熔断的兜底方法
    public String deal_testHotHey(String p1, String p2, BlockException excelption) {
        // Sentinel系统默认提示：Blocked by Sentinel(flow limiting)
        return "deal_testHotKeyLimit:热点key限流失败";
    }


}
