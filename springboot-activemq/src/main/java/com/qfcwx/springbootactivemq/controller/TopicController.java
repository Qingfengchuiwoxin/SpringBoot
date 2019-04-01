package com.qfcwx.springbootactivemq.controller;

import com.qfcwx.springbootactivemq.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TopicController
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/31 15:31
 * @Version 1.0
 **/
@RestController
@RequestMapping("/api/v1.0")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping("/topic")
    public String publish(String message) {
        topicService.publish(message);
        return "成功";
    }

}
