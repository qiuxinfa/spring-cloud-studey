package com.ribbon.config;

import com.netflix.loadbalancer.IRule;
import com.ribbon.rule.MySelfRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: qiuxinfa
 * @Date: 2020/5/2
 * @Description: com.ribbon.config
 */
@Configuration
public class MyRibbonRule {
    @Bean
    public IRule selfRule(){
        //返回自定义的负载均衡策略
        return new MySelfRule();
    }
}
