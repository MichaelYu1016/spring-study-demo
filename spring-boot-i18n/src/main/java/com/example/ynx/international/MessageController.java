package com.example.ynx.international;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

/**
 * MessageSource使用
 * @author ynx
 * @version V1.0
 * @date 2020-06-14
 */
@RestController
@Slf4j
public class MessageController {

    @Autowired
    MessageSource messageSource;

    @GetMapping("/message")
    public String message() {
        String us = messageSource.getMessage("E-0000",null, Locale.US);
        String cn = messageSource.getMessage("E-0000",null, Locale.CHINA);
        log.info("US message is {}", us);
        log.info("China message is {}", cn);
        String unknown = messageSource.getMessage("E-0002",null,null);
        log.info("不指定Locale时的信息: {}",unknown);
        String unknown_us = messageSource.getMessage("E-0002",null,Locale.US);
        log.info("指定Locale时的信息: {}",unknown_us);
        String unknown_jp = messageSource.getMessage("E-0002",null,Locale.JAPAN);
        log.info("指定Locale的资源文件不存在时的信息: {}",unknown_jp);
        String[] params = {"message","读写"};
        String dynamic = messageSource.getMessage("E-0003",params,Locale.CHINA);
        log.info("获取动态信息:{}",dynamic);
        return "OK";
    }
}
