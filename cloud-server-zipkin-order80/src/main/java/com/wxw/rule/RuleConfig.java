package com.wxw.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: wxw
 * @create: 2020-03-24-18:26
 * 该规则不能放在 @ComponentScan 当前包及其子包下
 */
@Configuration
public class RuleConfig {
    @Bean
    public IRule myRule(){
        return new RandomRule();//定义为随机
    }

}
