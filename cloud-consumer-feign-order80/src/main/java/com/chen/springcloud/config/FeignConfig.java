package com.chen.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author cgh
 * @create 2021-11-12 16:40
 */

@Configuration
public class FeignConfig {
    //1、配置feign的日志功能（Full代表详细日志）
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
