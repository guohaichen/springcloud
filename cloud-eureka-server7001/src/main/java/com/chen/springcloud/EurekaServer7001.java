package com.chen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author cgh
 * @create 2021-11-10 15:53
 */
@SpringBootApplication
@EnableEurekaServer //激活Eureka服务器相关配置，作为注册中心，运行后输入localhost:7001/  即可访问spring Eureka服务主页；
public class EurekaServer7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001.class,args);
    }
}

