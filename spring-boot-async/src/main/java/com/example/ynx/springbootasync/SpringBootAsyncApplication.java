package com.example.ynx.springbootasync;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author ynx
 * @version V1.0
 * @date 2020-01-16
 */
@SpringBootApplication
@EnableAsync
public class SpringBootAsyncApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAsyncApplication.class, args);
	}

}
