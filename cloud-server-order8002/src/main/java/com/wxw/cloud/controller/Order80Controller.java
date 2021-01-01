package com.wxw.cloud.controller;

import com.wxw.cloud.domain.Person;
import com.wxw.cloud.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * @Author: wxw
 * @create: 2020-03-22-18:16
 */
@RestController
@Slf4j
public class Order80Controller {

    //public static final String PAYMENT_URL = "http://localhost:8001";

    // zipkin
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-RPC";

    @Resource
    private RestTemplate restTemplate;


    @GetMapping("/remotePay/{id}")
    public  String getPayment(@PathVariable("id") Long id)
    {
        return restTemplate.getForObject(PAYMENT_URL+"/discovery",String.class);
    }

    // 测试Rest的两种情况

    //1.返回对象为响应体中数据转化成对象，基本上可以理解为JSON
    @GetMapping("/payment/object")
    public Result<Person>  getTestObject(){
        //Person person = new Person(1, "魏永杰", 18, "测试RestTemplate的getForObject方法");
        return restTemplate.getForObject(PAYMENT_URL + "/payment", Result.class);
    }

    //2.返回对象包含了响应体中的一些信息，比如响应头，响应状态码，响应体
    @GetMapping("/payment/entity")
    public Result<Person>  getTestEntity(){
        ResponseEntity<Result> entity =restTemplate.getForEntity(PAYMENT_URL+"/payment", Result.class);
        if(entity.getStatusCode().is2xxSuccessful()){
            return entity.getBody();
        }else {
            return new Result(444,"操作失败");
        }
    }

    // ====================> zipkin+sleuth
    @GetMapping("/consumer/payment/zipkin")
    public String paymentZipkin()
    {
       // String result = restTemplate.getForObject("http://localhost:8001"+"/payment/zipkin/", String.class);
        String result = restTemplate.getForObject(PAYMENT_URL+"/payment/zipkin/", String.class);
        return result;
    }



}
