package com.qfcwx.springbootmybatis.service.impl;

import com.qfcwx.springbootmybatis.mapper.UserMapper;
import com.qfcwx.springbootmybatis.pojo.User;
import com.qfcwx.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: UserServiceImpl
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/12 16:53
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public Long save(User user) {
        userMapper.insert(user);
        Long id = user.getId();
        return id;
    }

    @Override
    public User findById(Long id) {
        return userMapper.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public void delete(Long id) {
        userMapper.delete(id);
    }
}
