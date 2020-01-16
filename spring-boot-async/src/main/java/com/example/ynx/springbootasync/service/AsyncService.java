package com.example.ynx.springbootasync.service;

import java.util.concurrent.Future;

/**
 * @author ynx
 * @version V1.0
 * @date 2020-01-16
 */
public interface AsyncService {
    /**
     * 异步处理方法
     */
    void asyncMethod();

    /**
     * 同步处理方法
     */
    void syncMethod();

    /**
     * 异步回调方法
     * @return java.util.concurrent.Future<java.lang.String>
     */
    Future<String> asyncCallback();
}
