package com.chen.myRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author cgh
 * @create 2021-11-12 10:42
 * 1、创建了一个Ribbon，randomRule随机算法的restTemplate调用机制，注意：要放在springboot扫描不到的包下（不在主启动类路径下），
 * 2. 调用，在主启动类上调用
 */
@Configuration
public class MyselfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
