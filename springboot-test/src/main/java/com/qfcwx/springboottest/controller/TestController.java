package com.qfcwx.springboottest.controller;

import com.qfcwx.springboottest.pojo.User;
import com.qfcwx.springboottest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
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
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping(value = "user/{id}")
    public User findOne(@PathVariable("id") Long id){
        return userService.findOne(id);
    }

    @PostMapping(value = "user")
    public User save(){
        return userService.save(new User(100L,"道路千万条",new Date(),"女"));
    }

    @DeleteMapping(value = "user/{id}")
    public List<User> delete(@PathVariable("id") Long id){
        return userService.delete(id);
    }

    @PatchMapping(value = "user/name")
    public User updateName(@RequestBody User user){
        return userService.updateName(user);
    }

    @PutMapping(value = "user")
    public User update(@RequestBody User user){
        return  userService.update(user);
    }
}
