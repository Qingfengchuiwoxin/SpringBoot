package com.qfcwx.springbootactivemq.config;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

import javax.jms.ConnectionFactory;
import javax.jms.Topic;

/**
 * @ClassName: CustomerTopic
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/30 17:56
 * @Version 1.0
 **/
@Configuration
public class CustomerTopic {

    private static final String VIDEO_TOPIC = "video.topic";

    @Bean
    public Topic topic() {
        return new ActiveMQTopic(VIDEO_TOPIC);
    }


    /**
     * 如果想要同时支持点对点和发布订阅，则需要配置这个
     *
     * @param connectionFactory
     * @return
     */
    @Bean
    public JmsListenerContainerFactory<?> jmsListenerContainerFactory(ConnectionFactory connectionFactory) {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        factory.setPubSubDomain(true);
        factory.setConnectionFactory(connectionFactory);
        return factory;
    }
}
