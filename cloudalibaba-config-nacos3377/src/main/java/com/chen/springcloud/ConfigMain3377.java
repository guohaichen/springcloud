package com.chen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author cgh
 * @create 2021-11-18 14:21
 */

@SpringBootApplication
@EnableDiscoveryClient //nacos
public class ConfigMain3377 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigMain3377.class,args);
    }
}
