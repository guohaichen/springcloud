package com.chen.springcloud.alibaba.controller;

import com.chen.springcloud.entity.CommonResult;
import com.chen.springcloud.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author cgh
 * @create 2021-11-10 13:34
 */
@RestController
public class OrderController {
    /**
     注意，这里一定要写http://
     */
    //private static final String PAYMENT_URL = "http://127.0.0.1:8001";//单机版本
            /*这是paymentService8001，8002在eureka中注册的application name*/
    private static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    RestTemplate restTemplate;

    //消费者调用支付接口
    @GetMapping("/customer/payment/addPayment")
    public CommonResult<Payment> addOrder(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/add/addPayment",payment,CommonResult.class);
    }
    @GetMapping("/customer/payment/get/{id}")
    public CommonResult<Payment> getOrder(@PathVariable Long id){
        // 注意 getForObject中url的写法，url+id
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);

    }

}
