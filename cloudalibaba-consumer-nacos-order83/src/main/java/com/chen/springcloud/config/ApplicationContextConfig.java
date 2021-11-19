package com.chen.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


/**
 * @author cgh
 * @create 2021-11-18 9:58
 * nacos中集成了ribbon的依赖，可以直接使用负载均衡，会议一下ribbon负载均衡的调用方法，都是new RestTemplate去映射接口
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
