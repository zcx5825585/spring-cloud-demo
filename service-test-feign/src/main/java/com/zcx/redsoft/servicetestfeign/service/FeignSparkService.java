package com.zcx.redsoft.servicetestfeign.service;

import com.zcx.redsoft.servicetestfeign.service.fallback.FeignSparkServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 类说明
 *
 * @author zcx
 * @version 创建时间：2018/10/26  15:56
 */
@FeignClient(value = "service-spark", fallback = FeignSparkServiceFallBack.class)
public interface FeignSparkService {

    //获得模型
    @RequestMapping("recommendation/getModel")
    public String getModel();

    //重新训练模型
    @RequestMapping("recommendation/getNewModel")
    public String getNewModel();


    //预测评分
    @RequestMapping("recommendation/makePoint")
    public double makePoint(@RequestParam("userId") Integer userId, @RequestParam("filmID") Integer filmID);

    //推荐电影
    @RequestMapping("recommendation/recommendation")
    public List<String> recommendation(@RequestParam("userId") Integer userId, @RequestParam("count") Integer count);

    //验证
    @RequestMapping("recommendation/test")
    public String test();

    //试参
    @RequestMapping("recommendation/best")
    public void best();

}
