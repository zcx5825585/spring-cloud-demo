package com.zcx.redsoft.servicetestfeign.controller;

import com.zcx.redsoft.servicetestfeign.service.FeignSparkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 类说明
 *
 * @author zcx
 * @version 创建时间：2018/10/26  15:59
 */
@RestController
public class FeignSparkController {

    @Autowired
    private FeignSparkService feignSparkService;

    //获得模型
    @RequestMapping("getModel")
    public String getModel() {
        return feignSparkService.getModel();
    }

    //重新训练模型
    @RequestMapping("getNewModel")
    public String getNewModel() {
        return feignSparkService.getNewModel();
    }


    //预测评分
    @RequestMapping("makePoint")
    public double makePoint(Integer userId, Integer filmID) {
        return feignSparkService.makePoint(userId, filmID);
    }

    //推荐电影
    @RequestMapping("recommendation")
    public List<String> recommendation(Integer userId, Integer count) {
        return feignSparkService.recommendation(userId, count);
    }

    //验证
    @RequestMapping("test")
    public String test() {
        return feignSparkService.test();
    }

    //试参
    @RequestMapping("best")
    public void best() {
        feignSparkService.best();
    }

}
