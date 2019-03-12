package com.qfcwx.springbootmybatis.pojo;

import java.util.Date;

/**
 * @ClassName: User
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/12 16:13
 * @Version 1.0
 **/
public class User {

    private Long id;

    private String name;

    private String phone;

    private Integer age;

    private Date createDate;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
