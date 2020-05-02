package com.qxf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Auther: qiuxinfa
 * @Date: 2020/4/29
 * @Description: com.qxf
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.qxf")   //启用feign
@ComponentScan("com.qxf")
public class DeptConsumer_feign {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_feign.class,args);
    }
}
