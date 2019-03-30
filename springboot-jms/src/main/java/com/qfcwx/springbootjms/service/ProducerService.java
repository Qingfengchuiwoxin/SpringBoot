package com.qfcwx.springbootjms.service;

import javax.jms.Destination;

/**
 * @ClassName: ProducerService
 * @Author: 清风一阵吹我心
 * @Description: TODO  消息生产
 * @Date: 2019/3/30 15:01
 * @Version 1.0
 **/
public interface ProducerService {


    /**
     * 指定消息队列，还有消息
     * @param destination 队列
     * @param message 消息
     */
    void sendMessage(Destination destination,final String message);

    /**
     * 使用默认消息队列，发送消息
     * @param message
     */
    void sendMessage(final String message);
}
