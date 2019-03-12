package com.qfcwx.springbootjackson.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * @ClassName: User
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/9 12:41
 * @Version 1.0
 **/
public class User {

    /**
     * 空字段不返回
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String username;

    /**
     * 不显示密码
     */
    @JsonIgnore
    private String password;

    private int age;

    /**
     * 格式化,支持正则表达式
     */
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",locale = "zh",timezone = "GMT+8")
    private Date date;

    /**
     * 指定别名
     */
    @JsonProperty("tp")
    private String phone;

    public User(String username, String password, int age, Date date,String phone) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.date = date;
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
