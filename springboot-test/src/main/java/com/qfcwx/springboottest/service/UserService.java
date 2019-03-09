package com.qfcwx.springboottest.service;

import com.qfcwx.springboottest.pojo.User;

import java.util.List;

/**
 * @ClassName: UserService
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/9 17:12
 * @Version 1.0
 **/
public interface UserService {

    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();

    /**
     * 根据id查询用户
     * @param id 用户id
     * @return
     */
    User findOne(Long id);

    /**
     * 保存用户
     * @param user
     * @return
     */
    User save(User user);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    List<User> delete(Long id);

    /**
     * 更新名字
     * @param user
     * @return
     */
    User updateName(User user);

    /**
     * 全部更新
     * @param user
     * @return
     */
    User update(User user);
}
