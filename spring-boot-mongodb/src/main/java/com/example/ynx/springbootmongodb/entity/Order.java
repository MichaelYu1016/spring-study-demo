package com.example.ynx.springbootmongodb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 订单实体
 * @author ynx
 * @version V1.0
 * @date 2020-02-26
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "order")
public class Order implements Serializable {

    private static final long serialVersionUID = 7429590305446115504L;
    private String id;
    private String orderNo;
    private String customerName;
    private String productName;
    private BigDecimal moneyAmount;
}
