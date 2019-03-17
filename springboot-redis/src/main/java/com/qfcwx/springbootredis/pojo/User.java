package com.qfcwx.springbootredis.pojo;

import java.util.Date;

/**
 * @ClassName: User
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/14 18:36
 * @Version 1.0
 **/
public class User {

    private String name;


    private Integer age;

    private String phone;

    private Date createTime;

    public User(String name, Integer age, String phone, Date createTime) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
