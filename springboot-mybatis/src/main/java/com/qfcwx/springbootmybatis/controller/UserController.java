package com.qfcwx.springbootmybatis.controller;

import com.qfcwx.springbootmybatis.pojo.User;
import com.qfcwx.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @ClassName: UserController
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/12 16:59
 * @Version 1.0
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/user")
    public Long save(User user) {
        user.setCreateDate(new Date());
        Long n = userService.save(user);
        return n;
    }

    @GetMapping(value = "/user/{id}")
    public User findById(@PathVariable("id") Long id) {
        return userService.findById(id);
    }

    @GetMapping(value = "/user")
    public List<User> findAll() {
        return userService.findAll();
    }

    @PutMapping(value = "/user/name")
    public void update(User user) {
        userService.update(user);
    }

    @DeleteMapping(value = "/user/{id}")
    public void delete(@PathVariable("id") Long id) {
        userService.delete(id);
    }

    @GetMapping(value = "/tran")
    public Object testTransaction(){
        int n = userService.testTransaction();
        return n;
    }


}
