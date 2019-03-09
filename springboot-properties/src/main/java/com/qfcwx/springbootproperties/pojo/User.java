package com.qfcwx.springbootproperties.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @ClassName: User
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/9 15:53
 * @Version 1.0
 **/
@Component
@PropertySource(value = "classpath:customer.properties")
@ConfigurationProperties(prefix = "user")
public class User {

    private String author;

    private int age;

    private String sex;

    private String career;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    @Override
    public String toString() {
        return "User{" +
                "author='" + author + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", career='" + career + '\'' +
                '}';
    }
}
