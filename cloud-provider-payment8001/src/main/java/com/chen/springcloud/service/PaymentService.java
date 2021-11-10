package com.chen.springcloud.service;

import com.chen.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author cgh
 * @create 2021-11-10 9:17
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id")Long id);
}
