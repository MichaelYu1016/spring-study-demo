package com.example.ynx.springbootasync.service.impl;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import com.example.ynx.springbootasync.service.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

/**
 * @author ynx
 * @version V1.0
 * @date 2020-01-16
 */
@Service
public class AsyncServiceImpl implements AsyncService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Async
    @Override
    public void asyncMethod() {
        long start = System.currentTimeMillis();
        logger.info("异步方法开始");
        sleep();
        logger.info("异步方法内部线程名称：{}", Thread.currentThread().getName());
        long end = System.currentTimeMillis();
        logger.info("异步方法结束, 总耗时：{} ms", end - start);
    }

    @Override
    public void syncMethod() {
        long start = System.currentTimeMillis();
        logger.info("同步方法开始");
        sleep();
        long end = System.currentTimeMillis();
        logger.info("同步方法线程名称：{}", Thread.currentThread().getName());
        logger.info("同步方法结束, 总耗时：{} ms", end - start);
    }

    @Async
    @Override
    public Future<String> asyncCallback() {
        long start = System.currentTimeMillis();
        logger.info("异步回调方法开始");
        sleep();
        logger.info("异步回调方法内部线程名称：{}", Thread.currentThread().getName());
        long end = System.currentTimeMillis();
        logger.info("异步回调方法结束, 总耗时：{} ms", end - start);
        return new AsyncResult<>("I have done!");
    }

    private void sleep(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
