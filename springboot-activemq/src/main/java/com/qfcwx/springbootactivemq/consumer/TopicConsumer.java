package com.qfcwx.springbootactivemq.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName: TopicConsumer
 * @Author: 清风一阵吹我心
 * @Description: TODO  消息订阅
 * @Date: 2019/3/31 15:34
 * @Version 1.0
 **/
@Component
public class TopicConsumer {

    @JmsListener(destination = "video.topic",containerFactory = "jmsListenerContainerFactory")
    public void receive1(String text) {
        System.out.println("消费者1 :" + text);
    }

    @JmsListener(destination = "video.topic",containerFactory = "jmsListenerContainerFactory")
    public void receive2(String text) {
        System.out.println("消费者2 :" + text);
    }

    @JmsListener(destination = "video.topic")
    public void receive3(String text) {
        System.out.println("消费者3 :" + text);
    }

}
