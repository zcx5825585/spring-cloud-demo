package com.zcx.redsoft.servicetestfeign.controller;

import com.zcx.redsoft.servicetestfeign.service.PythonTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类说明
 *
 * @author zcx
 * @version 创建时间：2018/11/29  15:13
 */
@RestController
public class PythonController {
    @Autowired
    private PythonTestService pythonTestService;

    @RequestMapping("getUser")
    public String getUser() {
        return pythonTestService.getUser();
    }

    @RequestMapping("num")
    public String num() {
        return pythonTestService.num("D:/Python/content/p_num.png");
    }
}
