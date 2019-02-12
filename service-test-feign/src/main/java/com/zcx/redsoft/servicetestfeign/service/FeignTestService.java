package com.zcx.redsoft.servicetestfeign.service;

import com.zcx.redsoft.servicetestfeign.service.fallback.FeignTestServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 类说明
 *
 * @author zcx
 * @version 创建时间：2018/12/5  10:34
 */
@FeignClient(value = "service-test", fallback = FeignTestServiceFallBack.class)
public interface FeignTestService {
    //测试
    @RequestMapping(value = "testFeign")
    String testFeign();

}
