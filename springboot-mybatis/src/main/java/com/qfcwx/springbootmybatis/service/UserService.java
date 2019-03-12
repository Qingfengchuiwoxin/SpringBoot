package com.qfcwx.springbootmybatis.service;

import com.qfcwx.springbootmybatis.pojo.User;

import java.util.List;

/**
 * @ClassName: UserService
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/12 16:52
 * @Version 1.0
 **/
public interface UserService {

    Long save(User user);

    User findById(Long id);

    List<User> findAll();

    void update(User user);

    void delete(Long id);
}
