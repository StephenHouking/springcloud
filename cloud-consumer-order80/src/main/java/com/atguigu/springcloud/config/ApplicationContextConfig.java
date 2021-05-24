package com.atguigu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author houjing
 * @create 2021/5/21 14:12
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate geRestTemplate() {

        return new RestTemplate();
    }
}
