package com.wxw.cloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: wxw
 * @create: 2020-06-25-15:31
 */
@Configuration
@MapperScan({"com.wxw.cloud.dao"})
public class MyBatisConfig {

}
