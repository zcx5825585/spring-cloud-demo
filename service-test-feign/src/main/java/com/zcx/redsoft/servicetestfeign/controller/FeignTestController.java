package com.zcx.redsoft.servicetestfeign.controller;

import com.zcx.redsoft.servicetestfeign.service.FeignTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类说明
 *
 * @author zcx
 * @version 创建时间：2018/12/5  10:35
 */
@RestController
public class FeignTestController {
    @Value("${server.port}")
    String port;
    @Autowired
    private FeignTestService feignTestService;

    @RequestMapping("testFeign")
    public String testFeign() {
        StringBuffer sb = new StringBuffer();
        for (int count = 0; count < 5; count++) {
            sb.append("feign:" + port + "    use   " + feignTestService.testFeign() + "<br>");
        }
        return sb.toString();
    }

}
