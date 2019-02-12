package com.zcx.redsoft.zuulribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 类说明
 *
 * @author zcx
 * @version 创建时间：2018/10/31  13:48
 */
@Configuration
@RefreshScope
public class BeanConfig {
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
