package com.chen.springcloud.service;

import com.chen.springcloud.entity.CommonResult;
import com.chen.springcloud.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author cgh
 * @create 2021-11-12 14:52
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {


    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getOrderById(@PathVariable("id")Long id);
}
