package com.example.ynx.springbootthymeleaf.controller;

import com.example.ynx.springbootthymeleaf.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @author ynx
 * @version V1.0
 * @date 2020-01-18
 */
@Controller
public class ExampleController {

    @GetMapping("/hello")
    public String index(Model m) {
        String user = "Zhang San";
        m.addAttribute("user",user);
        return "hello";
    }

    @GetMapping("/user")
    public String welcome(Model model) {
        User user = new User();
        user.setName("张三");
        user.setAge(26);
        model.addAttribute("user",user);
        return "welcome";
    }
}
