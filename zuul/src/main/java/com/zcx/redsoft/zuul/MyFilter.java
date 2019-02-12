package com.zcx.redsoft.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 类说明
 *
 * @author zcx
 * @version 创建时间：2018/10/27  15:54
 */
@Component
public class MyFilter extends ZuulFilter {

    @Value("${server.port}")
    private String port;

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("Filter:" + port);
        return null;
    }
}
