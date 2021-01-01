package com.wxw.cloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: wxw
 * @create: 2020-03-24-21:50
 */
@Configuration
public class FeginConfig {
    /**
     * 配置fegin的日志级别
     *    NONE，不记录（DEFAULT）。
     *    BASIC，仅记录请求方法和URL以及响应状态代码和执行时间。
     *    HEADERS，记录基本信息以及请求和响应标头。
     *    FULL，记录请求和响应的标题，正文和元数据
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
