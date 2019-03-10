package com.qfcwx.springboottest.service.impl;

import com.qfcwx.springboottest.pojo.User;
import com.qfcwx.springboottest.service.UserService;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @ClassName: UserServiceImpl
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/9 17:13
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    private static final List<User> USER_LIST = new ArrayList<>();

    static {
        USER_LIST.add(new User(1L, "清", 11, "男"));
        USER_LIST.add(new User(2L, "风", 12, "女"));
        USER_LIST.add(new User(3L, "吹", 13, "男"));
        USER_LIST.add(new User(4L, "我", 14, "男"));
        USER_LIST.add(new User(5L, "心", 15, "女"));
    }

    @Override
    public List<User> findAll() {
        return USER_LIST;
    }

    @Override
    public User findOne(Long id) {
        for (User user : USER_LIST) {
            return user.getId().equals(id) ? user : null;
        }
        return null;
    }

    @Override
    public User save(User user) {
        USER_LIST.add(user);
        return user;
    }

    @Override
    public List<User> delete(Long id) {
        for (int i = 0; i < USER_LIST.size(); i++) {
            if (id.equals(USER_LIST.get(i).getId())) {
                USER_LIST.remove(i);
            }
        }
        return USER_LIST;
    }

    @Override
    public List<User> updateName(User user) {
        System.out.println("修改之前:" + USER_LIST);
        for (User user1 : USER_LIST) {
            if (user1.getId().equals(user.getId())) {
                user1.setName(user.getName());
            }
        }
        return USER_LIST;
    }

    @Override
    public List<User> update(User user) {
        System.out.println("修改之前:" + USER_LIST);
        for (User user1 : USER_LIST) {
            if (user1.getId().equals(user.getId())) {
                user1.setName(user.getName());
                user1.setAge(user.getAge());
                user1.setSex(user.getSex());
            }
        }
        return USER_LIST;
    }
}
