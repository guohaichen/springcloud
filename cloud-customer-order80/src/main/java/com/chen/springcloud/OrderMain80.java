package com.chen.springcloud;

import com.chen.myRule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author cgh
 * @create 2021-11-10 13:31
 */
@RibbonClient(name="CLOUD-PAYMENT-SERVICE",configuration = MyselfRule.class)
//启用自己改造过的Ribbon负载均衡机制，并应用到cloud-payment-service服务上
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}
