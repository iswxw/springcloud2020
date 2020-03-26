package com.wxw.cloud.controller;

import com.wxw.cloud.domain.Person;
import com.wxw.cloud.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

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

    // 给Rest 提供调用
    @GetMapping("/payment")
    public Result<Person>  getTestObject(){
        Person person = new Person(1, "魏永杰", 18, "测试RestTemplate的getForObject方法");
        Result<Person> result = new Result<>(200,"操作成功:"+serverPort);
        result.setSuccess(true);
        result.setData(person);
        return result;
    }

    // 服务提供方8001故意写暂停程序
    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout(){
        try { TimeUnit.SECONDS.sleep(3); }catch (Exception e) {e.printStackTrace();}
        return serverPort;
    }

    // gateway 加网关层
    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }

    // 给Rest 提供调用
    @GetMapping("/payment/get/{id}")
    public Result<Person>  getPayment(@PathVariable("id")Long id){
        Person person = new Person(1, "魏永杰", 18, "测试RestTemplate的getForObject方法");
        Result<Person> result = new Result<>(200,"操作成功："+serverPort);
        result.setSuccess(true);
        result.setData(person);
        return result;
    }

}
