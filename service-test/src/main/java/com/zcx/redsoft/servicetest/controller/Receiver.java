package com.zcx.redsoft.servicetest.controller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 类说明
 *
 * @author zcx
 * @version 创建时间：2018/12/5  10:40
 */
@Component
@RabbitListener(queues = "test")
public class Receiver {
    @RabbitHandler
    public void receiverHandler(String key) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("String:" + key);
    }

    @RabbitHandler
    public void oneReceiverHandler(Integer oneKey) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Integer:" + oneKey);
    }
}
