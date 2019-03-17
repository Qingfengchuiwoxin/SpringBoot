package com.qfcwx.springbootredis.controller;

import com.alibaba.fastjson.JSON;
import com.qfcwx.springbootredis.pojo.User;
import com.qfcwx.springbootredis.utils.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @ClassName: RedisController
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/14 11:28
 * @Version 1.0
 **/
@RestController
public class RedisController {

    @Autowired
    private RedisClient redisClient;

    @GetMapping("/add")
    public void add() {
        redisClient.set("username", "qfcwx");
    }

    @GetMapping("/select")
    public String select(@RequestParam String key) {
        return redisClient.get(key);
    }

    @GetMapping("/user")
    public boolean addUser() {
        User user = new User("qfcwx", 18, "110", new Date());
        String value = JSON.toJSONString(user);
        return redisClient.set("base:user", value);
    }

    @GetMapping("/find/user")
    public User findUser() {
        String value = redisClient.get("base:user");
        User user = JSON.parseObject(value, User.class);
        return user;
    }

}
