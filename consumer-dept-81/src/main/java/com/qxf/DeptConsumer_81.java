package com.qxf;

import com.ribbon.config.MyRibbonRule;
import com.ribbon.rule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Auther: qiuxinfa
 * @Date: 2020/4/29
 * @Description: com.qxf
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MyRibbonRule.class)
public class DeptConsumer_81 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_81.class,args);
    }
}
