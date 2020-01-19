package com.example.ynx.springbootjpa.controller;

import com.example.ynx.springbootjpa.dao.UserDao;
import com.example.ynx.springbootjpa.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ynx
 * @version V1.0
 * @date 2020-01-19
 */
@RestController
public class TestController {
    @Autowired
    UserDao userDao;

    @GetMapping("/users")
    public List<User> listUser() {
        return userDao.findAll();
    }

    @GetMapping("/user")
    public User getUserByUserName(@RequestParam(value = "username") String userName) {
        return userDao.findByUserName(userName);
    }
}
