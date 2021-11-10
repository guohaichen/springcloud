package com.chen.springcloud.controller;

import com.chen.springcloud.entity.CommonResult;
import com.chen.springcloud.entity.Payment;
import com.chen.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author cgh
 * @create 2021-11-10 9:29
 */
@RestController
@Slf4j
public class PaymentController {

    //@Resource根据bean名称注入和@Autowired根据bean类型注入
    @Resource
    PaymentService paymentService;

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> get(@PathVariable("id")Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info(payment.toString());
        return new CommonResult<Payment>(200,"\t查询完成\t",payment);
    }

    @PostMapping("/payment/add/addPayment")
    public CommonResult<Integer> add(@RequestBody Payment payment){
        /*这里如果不加@RequestBody则会插入null*/
        int result = paymentService.create(payment);
        if (result>0){
            log.info("共插入数据\t"+result+"条！");
            return new CommonResult<>(200,"插入成功",result);
        }log.info("插入失败!"+result);
        return new CommonResult<>(412,"插入失败",result);
    }

}
