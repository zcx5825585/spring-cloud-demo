package com.zcx.redsoft.servicetest.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 类说明
 *
 * @author zcx
 * @version 创建时间：2018/12/5  9:33
 */
@FeignClient(value = "sidecar")
public interface UserService {
    @RequestMapping(value = "/test")
    String getUser();
}
