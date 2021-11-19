package com.chen.springcloud.alibaba.comtroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cgh
 * @create 2021-11-17 17:35
 */
@RestController
public class PaymentController9002 {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") String id){
        return "nacos register, serverPort is "+ serverPort+"\t id "+id;
    }
}
