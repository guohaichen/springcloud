package com.chen.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author cgh
 * @create 2021-11-17 17:33
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Payment9002 {
    public static void main(String[] args) {
        SpringApplication.run(Payment9002.class,args);
    }
}
