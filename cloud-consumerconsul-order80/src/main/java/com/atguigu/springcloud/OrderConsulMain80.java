package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author houjing
 * @create 2021/6/2 14:02
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain80 {


    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain80.class,args);
    }
}
