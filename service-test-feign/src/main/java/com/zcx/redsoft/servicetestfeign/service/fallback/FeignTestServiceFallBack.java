package com.zcx.redsoft.servicetestfeign.service.fallback;

import com.zcx.redsoft.servicetestfeign.service.FeignTestService;

/**
 * 类说明
 *
 * @author zcx
 * @version 创建时间：2018/12/5  10:38
 */
public class FeignTestServiceFallBack implements FeignTestService {
    @Override
    public String testFeign() {
        return "feign fallback";
    }

}
