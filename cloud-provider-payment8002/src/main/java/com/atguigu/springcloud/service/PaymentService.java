package com.atguigu.springcloud.service;

import com.atguigu.springcloud.model.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author houjing
 * @create 2021/5/12 17:38
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
