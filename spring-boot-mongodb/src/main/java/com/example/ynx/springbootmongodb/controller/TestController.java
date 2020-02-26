package com.example.ynx.springbootmongodb.controller;

import com.example.ynx.springbootmongodb.dao.OrderDao;
import com.example.ynx.springbootmongodb.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ynx
 * @version V1.0
 * @date 2020-02-26
 */
@RestController
public class TestController {
    @Autowired
    OrderDao orderDao;

    @PostMapping("/order/add")
    public String addOrder(@RequestBody Order order) {
        System.out.println(order.toString());
        Order result = orderDao.saveOrder(order);
        return result.toString();
    }

    @PostMapping("/order/")
    public String getOrder(@RequestBody Order order) {
        System.out.println(order.getOrderNo());
        Order result = orderDao.findOrderByNo(order.getOrderNo());
        return result.toString();
    }

    @PostMapping("/order/edit")
    public String updateOrder(@RequestBody Order order) {
        System.out.println(order.toString());
        Long count = orderDao.updateOrder(order);
        return count.toString();
    }
}
