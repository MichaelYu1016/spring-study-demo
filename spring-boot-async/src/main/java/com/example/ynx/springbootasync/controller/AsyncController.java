package com.example.ynx.springbootasync.controller;

import java.util.concurrent.Future;

import com.example.ynx.springbootasync.service.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ynx
 * @version V1.0
 * @date 2020-01-16
 */
@RestController
public class AsyncController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AsyncService asyncService;

    @GetMapping("async")
    public void testAsync() {
        long start = System.currentTimeMillis();
        logger.info("接收请求，开始处理");
        asyncService.asyncMethod();
        long end = System.currentTimeMillis();
        logger.info("异步处理结束，耗时：{} ms", end - start);
    }

    @GetMapping("sync")
    public void testSync() {
        long start = System.currentTimeMillis();
        logger.info("接收请求，开始处理");
        asyncService.syncMethod();
        long end = System.currentTimeMillis();
        logger.info("同步处理结束，耗时：{} ms", end - start);
    }

    @GetMapping("asyncCallback")
    public String testAsyncCallback() throws Exception {
        long start = System.currentTimeMillis();
        logger.info("接收请求，开始处理");
        Future<String> stringFuture = asyncService.asyncCallback();
        String result = stringFuture.get();
        logger.info("异步回调方法返回值：{}", result);
        long end = System.currentTimeMillis();
        logger.info("异步回调结束，总耗时：{} ms", end - start);
        return stringFuture.get();
    }
}
