package com.qfcwx.springbootactivemq.service.impl;

import com.qfcwx.springbootactivemq.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Topic;

/**
 * @ClassName: TopicServiceImpl
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/31 15:28
 * @Version 1.0
 **/
@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    private Topic topic;

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Override
    public void publish(String message) {
        jmsMessagingTemplate.convertAndSend(this.topic, message);
    }
}
