package com.qfcwx.springboothelloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloController
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/9 12:30
 * @Version 1.0
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
