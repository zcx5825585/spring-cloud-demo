package com.zcx.redsoft.servicetest.controller;

import com.zcx.redsoft.servicetest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类说明
 *
 * @author zcx
 * @version 创建时间：2018/10/26  11:30
 */
@RestController
@RefreshScope
@RequestMapping
public class ServiceController {

    @Autowired
    private UserService userService;

    @Value("${server.port}")
    String port;
    @Value("${spring.application.name}")
    String serverName;
    @Value("${foo}")
    private String foo;

    @RequestMapping("testFeign")
    public String testFeign() {
        System.out.println("service");
        return  serverName+":"+port;
//        return "service-test:" + userService.getUser();
    }

    @RequestMapping("foo")
    public String foo() {
        return "service-test:" + foo;
    }
}
