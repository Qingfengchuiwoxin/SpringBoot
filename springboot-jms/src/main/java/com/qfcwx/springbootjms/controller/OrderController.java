package com.qfcwx.springbootjms.controller;

import com.qfcwx.springbootjms.pojo.ResultBean;
import com.qfcwx.springbootjms.service.ProducerService;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Destination;

/**
 * @ClassName: OrderController
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/30 15:19
 * @Version 1.0
 **/
@RestController
@RequestMapping("/api/v1.0")
public class OrderController {

    @Autowired
    private ProducerService producerService;

    @GetMapping("/order")
    public Object order(String message) {
        //生成消息队列地址
        Destination destination = new ActiveMQQueue("order.queue");
        producerService.sendMessage(destination, message);
        return ResultBean.success("发送成功");
    }

    @GetMapping("/common")
    public Object common(String message) {
        producerService.sendMessage(message);
        return ResultBean.success("发送成功");
    }
}
