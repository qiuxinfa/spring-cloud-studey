package com.qxf.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: qiuxinfa
 * @Date: 2020/4/29
 * @Description: com.qxf.config
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced  //ribbon负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule myRule(){
        //ribbon负载均衡策略，已经实现的有7种，默认的轮询算法RoundRobinRule
        return new RandomRule();   //随机算法
    }
}
