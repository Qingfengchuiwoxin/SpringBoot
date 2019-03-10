package com.qfcwx.springboottest.controller;

import com.qfcwx.springboottest.pojo.User;
import com.qfcwx.springboottest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName: TestController
 * @Author: 清风一阵吹我心
 * @Description: TODO  以Restful的方式进行mockmvc演示
 * @Date: 2019/3/9 17:11
 * @Version 1.0
 **/
@RestController
@RequestMapping("/v1/")
public class TestController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "user")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping(value = "user/{id}")
    public User findOne(@PathVariable("id") Long id) {
        return userService.findOne(id);
    }

    @PostMapping(value = "user")
    public User save(User user) {
        return userService.save(user);
    }

    @DeleteMapping(value = "user/{id}")
    public List<User> delete(@PathVariable("id") Long id) {
        return userService.delete(id);
    }

    @PatchMapping(value = "user/name")
    public List<User> updateName(User user) {
        return userService.updateName(user);
    }

    @PutMapping(value = "user")
    public List<User> update(User user) {
        return userService.update(user);
    }
}
