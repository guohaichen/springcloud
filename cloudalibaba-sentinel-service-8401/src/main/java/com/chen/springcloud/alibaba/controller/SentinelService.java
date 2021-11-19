package com.chen.springcloud.alibaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cgh
 * @create 2021-11-19 16:04
 */
@RestController
public class SentinelService {
    @GetMapping("/testA")
    public String testA(){
        return "__________testA__________";
    }

    @GetMapping("/testB")
    public String testB(){
        return "___________testB_________";
    }
}
