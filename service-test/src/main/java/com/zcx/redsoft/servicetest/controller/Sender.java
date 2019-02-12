package com.zcx.redsoft.servicetest.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类说明
 *
 * @author zcx
 * @version 创建时间：2018/12/5  10:39
 */
@RestController
public class Sender {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RequestMapping("send")
    public void send() {
        System.out.println("sender");
        rabbitTemplate.convertAndSend("test", "this is a test");
    }

    @RequestMapping("sendByStep")
    public void sendByStep() {
        try {
            for (Integer i = 0; i < 5000; i++) {
                Thread.sleep(10);
                rabbitTemplate.convertAndSend("test", "word");
                System.out.println("send:" + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
