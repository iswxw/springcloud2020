package com.wxw.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author ：wxw.
 * @ Date ： 15:43 2020/6/7
 * @ Description：以rest的方式读取配置中心的数据信息
 * @ Version:   v_0.0.1
 */
// 配置刷新功能
@RefreshScope
@RestController
public class ConfigClientController {


    @Value("${config.info}")
    private String configInfo;


    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}
