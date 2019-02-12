package com.zcx.redsoft.servicetestfeign.service;

import com.zcx.redsoft.servicetestfeign.service.fallback.PythonTestServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 类说明
 *
 * @author zcx
 * @version 创建时间：2018/10/26  15:56
 */
@FeignClient(value = "sidecar", fallback = PythonTestServiceFallBack.class)
public interface PythonTestService {

    //代理？
    @RequestMapping(value = "/test")
    String getUser();

    @RequestMapping(value = "/num", method = RequestMethod.GET)
    String num(@RequestBody String file_name);
}
