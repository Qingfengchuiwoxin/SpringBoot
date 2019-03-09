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
        USER_LIST.add(new User(1L, "清", new Date(), "男"));
        USER_LIST.add(new User(2L, "风", new Date(), "女"));
        USER_LIST.add(new User(3L, "吹", new Date(), "男"));
        USER_LIST.add(new User(4L, "我", new Date(), "男"));
        USER_LIST.add(new User(5L, "心", new Date(), "女"));
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
    public User updateName(User user) {
        for (User user1 : USER_LIST) {
            if (user1.getId().equals(user.getId())) {
                user1.setName(user.getName());
            }
        }
        return user;
    }

    @Override
    public User update(User user) {
        for (User user1 : USER_LIST) {
            if (user1.getId().equals(user.getId())) {
                user1.setName(user.getName());
                user1.setDate(user.getDate());
                user1.setSex(user.getSex());
            }
        }
        return user;
    }
}
