package com.qfcwx.springboottest.pojo;

import java.util.Date;

/**
 * @ClassName: User
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/9 17:09
 * @Version 1.0
 **/
public class User {

    private Long id;

    private String name;

    private Date date;

    private String sex;

    public User(Long id, String name, Date date, String sex) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.sex = sex;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", sex='" + sex + '\'' +
                '}';
    }
}
