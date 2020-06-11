package com.wxw.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author: wxw
 * @create: 2020-06-11-22:30
 */
@Component
public class RabbitConfig {
    /**
     * {@link org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration}
     *  会自动识别
     * @param objectMapper json序列化实现类
     * @return mq 消息序列化工具
     */
    @Bean
    public MessageConverter jsonMessageConverter(ObjectMapper objectMapper) {
        return new Jackson2JsonMessageConverter(objectMapper);
    }
}
