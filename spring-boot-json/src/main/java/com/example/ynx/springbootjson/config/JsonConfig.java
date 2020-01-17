package com.example.ynx.springbootjson.config;

import java.text.SimpleDateFormat;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Json配置类
 * @author ynx
 * @version V1.0
 * @date 2020-01-17
 */
@Configuration
public class JsonConfig {
    @Bean
    public ObjectMapper getObjectMapper(){
        ObjectMapper mapper = new ObjectMapper();
        // 设置时间格式
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        // 是否包含取值为null的字段
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        // json序列化是对名称的处理策略（userName->user_name)
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        // 反序列化设置多字段，少字段的处理
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper;
    }
}
