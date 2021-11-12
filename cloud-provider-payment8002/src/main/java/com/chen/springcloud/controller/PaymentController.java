package com.chen.springcloud.controller;

import com.chen.springcloud.entity.CommonResult;
import com.chen.springcloud.entity.Payment;
import com.chen.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

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

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> get(@PathVariable("id")Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info(payment.toString());
        return new CommonResult<Payment>(200,"\t查询完成\tserverPort: "+serverPort,payment);
    }

    @PostMapping("/payment/add/addPayment")
    public CommonResult<Integer> add(@RequestBody Payment payment){
        /*这里如果不加@RequestBody则会插入null*/
        int result = paymentService.create(payment);
        if (result>0){
            log.info("共插入数据\t"+result+"条！");
            return new CommonResult<>(200,"插入成功 serverPort: "+serverPort,result);
        }log.info("插入失败!"+result);
        return new CommonResult<>(412,"插入失败",result);
    }

    /**
     * openFeign默认只等待一秒钟，这里模拟一个连接超时的错误，
     * openFeign80接口调取下面这个服务
     */
    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeout(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }

}
