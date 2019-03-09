package com.qfcwx.springbootproperties.controller;

import com.qfcwx.springbootproperties.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: PropertisController
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/9 15:41
 * @Version 1.0
 **/
@RestController
public class PropertiesController {

    @Value("${project.book}")
    private String book;

    @Value("${project.author}")
    private String author;

    @Value("${project.age}")
    private int age;

    @Autowired
    private User user;


    @GetMapping(value = "/book")
    public String bookInfo() {
        return "《"+book + "》这本书的作者是:" + author + "," + age + "岁啦!";
    }

    @GetMapping(value = "/user")
    public User userInfo(){
        System.out.println(user);
        return user;
    }
}
