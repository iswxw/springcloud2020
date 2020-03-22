package com.wxw.cloud.controller;

import com.wxw.cloud.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: wxw
 * @create: 2020-03-22-18:52
 */
@Slf4j
@RestController
public class Pay8002Controller {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/discovery")
    public String discoveryTest(){
        Result result = new Result();
        result.setMessage(serverPort);
        result.setSuccess(true);
        return serverPort;
    }

}
