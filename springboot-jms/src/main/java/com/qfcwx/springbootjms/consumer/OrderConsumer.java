package com.qfcwx.springbootjms.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName: OrderConsumer
 * @Author: 清风一阵吹我心
 * @Description: TODO  消费者
 * @Date: 2019/3/30 15:59
 * @Version 1.0
 **/
@Component
public class OrderConsumer {

    private static final String ORDER_QUEUE = "order.queue";

    private static final String QFCWX_QUEUE = "qfcwx.queue";

    /**
     * 实时监听对应的队列
     *
     * @param text
     */
    @JmsListener(destination = "order.queue")
    public void receiveOQueue(String text) {
        System.out.println("收到" + ORDER_QUEUE + "的消息为:" + text);
    }

    @JmsListener(destination = "qfcwx.queue")
    public void receiveQQueue(String message) {
        System.out.println("收到" + QFCWX_QUEUE + "的消息为:" + message);
    }
}
