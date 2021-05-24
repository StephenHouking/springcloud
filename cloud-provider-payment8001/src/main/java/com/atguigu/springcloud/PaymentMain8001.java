package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author houjing
 * @create 2021/5/12 16:38
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8001 {


    public static void main(String[] args) {

        SpringApplication.run(PaymentMain8001.class, args);
    }
}
