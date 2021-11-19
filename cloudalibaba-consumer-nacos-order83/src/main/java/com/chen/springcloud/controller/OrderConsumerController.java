package com.chen.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author cgh
 * @create 2021-11-18 10:01
 */
@RestController
public class OrderConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${service-provider.nacos-provider-service}")
    private String serverURL;

    @GetMapping(value="/consumer/payment/nacos/{id}")
    public String getPayment(@PathVariable String id){
        return restTemplate.getForObject(serverURL+"/payment/nacos/"+id,String.class);
    }

}
