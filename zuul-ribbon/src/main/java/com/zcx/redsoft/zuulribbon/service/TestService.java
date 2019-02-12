package com.zcx.redsoft.zuulribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 类说明
 *
 * @author zcx
 * @version 创建时间：2018/10/26  13:59
 */
@Service
public class TestService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "testFallBack")
    public String test(String url) {
        return restTemplate.getForObject("http://zuul/" + url, String.class);
    }

    public String testFallBack(String url) {
        return "ribbon fallback" + url;
    }
}
