package com.wxw.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wxw
 * @create: 2020-06-13-16:18
 */

@RestController
@RefreshScope   // 支持nacos动态刷新功能
public class ConfigClientController
{
    @Value("${config.info}")
    private String configInfo;

    // http://localhost:3377/config/info
    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo;
    }
}
