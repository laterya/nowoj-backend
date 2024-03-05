package com.yp.nowojbackendquestionservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.yp.nowojbackendquestionservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.yp")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.yp.nowojbackendserviceclient.service"})
public class NowojBackendQuestionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NowojBackendQuestionServiceApplication.class, args);
    }

}
