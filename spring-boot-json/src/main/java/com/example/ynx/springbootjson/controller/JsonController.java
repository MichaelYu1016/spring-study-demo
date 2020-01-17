package com.example.ynx.springbootjson.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import com.example.ynx.springbootjson.dao.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ynx
 * @version V1.0
 * @date 2020-01-17
 */
@RestController
public class JsonController {

    @GetMapping("/user")
    public User getUser() {
        User user = new User();
        user.setUserName("张三");
        user.setAge(26);
        user.setBirthday(LocalDate.now());
        user.setCreateTime(LocalDateTime.now());
        user.setMail("12345679887@qq.com");
        return user;
    }

    @PostMapping("/user")
    public Object addUser(@RequestBody User user) {
        System.out.println(user.toString());
        return null;
    }
}
