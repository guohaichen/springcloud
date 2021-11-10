package com.chen.springcloud.service.serviceImpl;

import com.chen.springcloud.dao.PaymentDao;
import com.chen.springcloud.entity.Payment;
import com.chen.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cgh
 * @create 2021-11-10 9:21
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
