package com.chen.springcloud.controller;

import com.chen.springcloud.entity.CommonResult;
import com.chen.springcloud.entity.Payment;
import com.chen.springcloud.service.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cgh
 * @create 2021-11-12 15:15
 */
@RestController
public class OrderFeignController {
    @Autowired
    PaymentFeignService paymentFeignService;


    @GetMapping("/customer/payment/get/{id}")
    public CommonResult<Payment> getOrderById(@PathVariable Long id){
        return paymentFeignService.getOrderById(id);
    }
}
