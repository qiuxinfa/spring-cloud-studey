package com.qxf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: qiuxinfa
 * @Date: 2020/5/1
 * @Description: com.qxf
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka_7002 {
    public static void main(String[] args) {
        SpringApplication.run(Eureka_7002.class,args);
    }
}
