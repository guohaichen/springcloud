package com.chen.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cgh
 * @create 2021-11-18 14:22
 */

@RestController
@RefreshScope//nacos-config实现动态刷新配置
public class ConfigController {

    @Value("${server.config.info}")
    private String info;

    @Value("${user.name}")
    private String name;

    @GetMapping("/config/info")
    public String getInfo(){
        return "server info:\t"+info+"\tuser name:\t"+name;
    }

}
