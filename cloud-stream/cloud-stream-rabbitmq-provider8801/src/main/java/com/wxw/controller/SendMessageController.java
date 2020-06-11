package com.wxw.controller;

import com.wxw.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: wxw
 * @create: 2020-06-11-22:17
 */
@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider messageProvider;

    @GetMapping("/send")
    public String SendMessage(){
        return messageProvider.send();
    }
}
