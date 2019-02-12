package com.zcx.redsoft.servicetestfeign.service.fallback;

import com.zcx.redsoft.servicetestfeign.service.PythonTestService;
import org.springframework.stereotype.Component;

/**
 * 类说明
 *
 * @author zcx
 * @version 创建时间：2018/10/27  14:10
 */
@Component
public class PythonTestServiceFallBack implements PythonTestService {
    @Override
    public String getUser() {
        return "test fallback";
    }

    @Override
    public String num(String file_name) {
        return null;
    }
}
