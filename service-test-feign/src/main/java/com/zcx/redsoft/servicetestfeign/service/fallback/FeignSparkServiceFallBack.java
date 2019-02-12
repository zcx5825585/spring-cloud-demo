package com.zcx.redsoft.servicetestfeign.service.fallback;

import com.zcx.redsoft.servicetestfeign.service.FeignSparkService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 类说明
 *
 * @author zcx
 * @version 创建时间：2018/10/27  14:10
 */
@Component
public class FeignSparkServiceFallBack implements FeignSparkService {
    @Override
    public String getModel() {
        return "feign fallback";
    }

    @Override
    public String getNewModel() {
        return "feign fallback";
    }

    @Override
    public double makePoint(Integer userId, Integer filmID) {
        return 0d;
    }

    @Override
    public List<String> recommendation(Integer userId, Integer count) {
        return null;
    }

    @Override
    public String test() {
        return "feign fallback";
    }

    @Override
    public void best() {

    }
}
