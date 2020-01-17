package com.example.ynx.springbootjson.dao;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;


import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author ynx
 * @version V1.0
 * @date 2020-01-17
 */
public class User implements Serializable {
    private static final long serialVersionUID = 6222176558369919436L;
//    可以指定property也可以通过config类设置property命名策略
//    @JsonProperty(value = "user_name")
    private String userName;
    private int age;
    private String password;
    private LocalDate birthday;
    private LocalDateTime createTime;
    private String mail;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", createTime=" + createTime +
                ", mail='" + mail + '\'' +
                '}';
    }
}
