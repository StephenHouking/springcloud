package com.atguigu.springcloud.service;

import ch.qos.logback.core.util.TimeUtil;
import cn.hutool.core.thread.ThreadUtil;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class PaymentService {

    public String paymentInfo_Ok(Integer id){
        return "线程池："+ ThreadUtil.currentThreadGroup().getName()+" paymentInfo_OK,id: "+id+"\t"+"hhhhhh";
    }

    public String paymentInfo_TimeOut(Integer id){
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        return "线程池："+ ThreadUtil.currentThreadGroup().getName()+" paymentInfo_OK,id: "+id+"\t"+"hhhhhh";
    }
}
