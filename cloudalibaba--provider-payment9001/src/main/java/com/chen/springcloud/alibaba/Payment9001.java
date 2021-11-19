package com.chen.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author cgh
 * @create 2021-11-17 16:07
 */
@SpringBootApplication
@EnableDiscoveryClient //nacos
public class Payment9001 {
    public static void main(String[] args) {
        SpringApplication.run(Payment9001.class, args);
    }
}
