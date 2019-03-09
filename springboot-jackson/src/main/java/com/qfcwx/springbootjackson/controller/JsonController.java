package com.qfcwx.springbootjackson.controller;

import com.qfcwx.springbootjackson.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @ClassName: JsonController
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/9 12:41
 * @Version 1.0
 **/
@RestController
public class JsonController {

    @GetMapping("/user")
    public User findUser(){
        return new User("清风","12345",18,new Date(),"11");
    }
}
