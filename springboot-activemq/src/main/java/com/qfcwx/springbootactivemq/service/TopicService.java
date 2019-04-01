package com.qfcwx.springbootactivemq.service;

/**
 * @ClassName: TopicService
 * @Author: 清风一阵吹我心
 * @Description: TODO 发布订阅生产者
 * @Date: 2019/3/31 15:28
 * @Version 1.0
 **/
public interface TopicService {

    /**
     * 消息发布
     * @param message
     */
    void publish(String message);
}
