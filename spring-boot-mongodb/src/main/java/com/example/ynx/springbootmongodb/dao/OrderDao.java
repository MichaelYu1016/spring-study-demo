package com.example.ynx.springbootmongodb.dao;

import com.example.ynx.springbootmongodb.entity.Order;
import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

/**
 * @author ynx
 * @version V1.0
 * @date 2020-02-26
 */
@Component
public class OrderDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 新增记录
     * @param order 订单
     * @return 新增order
     */
    public Order saveOrder(Order order){
        Order result = mongoTemplate.save(order);
        return result;
    }

    /**
     * 查找记录
     * @param orderNo 订单号
     * @return 订单
     */
    public Order findOrderByNo(String orderNo) {
        Query query = new Query(Criteria.where("orderNo").is(orderNo));
        Order order = mongoTemplate.findOne(query,Order.class);
        return order;
    }

    /**
     * 更新订单
     * @param order 订单
     * @return 修改数量
     */
    public Long updateOrder(Order order) {
        Query query = new Query(Criteria.where("orderNo").is(order.getOrderNo()));
        Update update = new Update().set("moneyAmount",order.getMoneyAmount());
        UpdateResult result = mongoTemplate.updateFirst(query,update,Order.class);
        return result.getModifiedCount();
    }
}
