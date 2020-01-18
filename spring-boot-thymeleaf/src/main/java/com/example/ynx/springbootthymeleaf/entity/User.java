package com.example.ynx.springbootthymeleaf.entity;

/**
 * 用户实体类
 *
 * @author ynx
 * @version V1.0
 * @date 2020-01-18
 */
public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
