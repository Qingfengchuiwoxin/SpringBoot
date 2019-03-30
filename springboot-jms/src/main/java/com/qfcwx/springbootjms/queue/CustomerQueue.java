package com.qfcwx.springbootjms.queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;

/**
 * @ClassName: CustomerQueue
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/30 14:54
 * @Version 1.0
 **/
@Configuration
public class CustomerQueue {

    private static final String QFCWX_QUEUE = "qfcwx.queue";

    @Bean
    public Queue queue(){
        return new ActiveMQQueue(QFCWX_QUEUE);
    }
}
