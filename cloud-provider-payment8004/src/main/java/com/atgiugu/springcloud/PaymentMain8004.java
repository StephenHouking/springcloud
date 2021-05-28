package com.atgiugu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author houjing
 * @create 2021/5/28 16:07
 */
@SpringBootApplication
@EnableDiscoveryClient // 该注解用于向使用console或者zookeeper作为注册中心时注册服务
public class PaymentMain8004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
    }
}
