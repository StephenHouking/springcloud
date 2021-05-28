package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.model.CommonResult;
import com.atguigu.springcloud.model.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author houjing
 * @create 2021/5/12 17:42
 */

@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("插入数据的ID:\t" + payment.getId());
        log.info("插入结果：" + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据成功, serverPort"+serverPort, result);
        } else {
        return new CommonResult(444, "插入数据失败, serverPort"+serverPort, null);
        }
    }


    @GetMapping("/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("***查询结果：" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询数据成功, serverPort"+serverPort, payment);
        } else {
            return new CommonResult(444, "没有对应记录, serverPort"+serverPort, null);
        }
    }

    @GetMapping("/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();

        for (String service : services){
            log.info("********** element",service);
        }
        List<ServiceInstance> serviceInstances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");

        for(ServiceInstance instance : serviceInstances){
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }

        return  this.discoveryClient;
    }

}
