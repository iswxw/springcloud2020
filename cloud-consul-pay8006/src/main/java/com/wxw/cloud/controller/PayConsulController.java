package com.wxw.cloud.controller;

import com.wxw.cloud.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author: wxw
 * @create: 2020-03-22-10:20
 */
@RestController
@Slf4j
public class PayConsulController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/findConsulPort")
    public Result discovertPort(){

        Result<String> result = new Result<>();
        result.setCode(Integer.valueOf(serverPort));
        result.setMessage(UUID.randomUUID().toString());
        return result;
    }
}
