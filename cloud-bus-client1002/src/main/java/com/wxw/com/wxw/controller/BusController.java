package com.wxw.com.wxw.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wxw
 * @create: 2020-06-10-23:21
 */
@RestController
public class BusController {

    @Value("${config.info}")
    private String serverPort;

    @Value("config.info")
    private String configInfo;

    @GetMapping("/configinfo")
    public String getConfigInfo(){
         return "serverPort:"+ serverPort+"\t\n\n configInfo:"+configInfo;
    }
}
