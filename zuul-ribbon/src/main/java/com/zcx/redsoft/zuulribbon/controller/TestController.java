package com.zcx.redsoft.zuulribbon.controller;

import com.zcx.redsoft.zuulribbon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类说明
 *
 * @author zcx
 * @version 创建时间：2018/10/26  14:02
 */
@RestController
public class TestController {

    @Value("${server.port}")
    String port;
    @Autowired
    private TestService testService;

    @RequestMapping("test")
    public String test() {
        StringBuffer sb = new StringBuffer();
        for (int count = 0; count < 2; count++) {
            sb.append("ribbon:" + port + "    use   " + testService.test("/service-spark/test") + "<br>");
        }
        return sb.toString();
    }
}
