package com.d.club.common.entity;

import java.io.Serializable;

/**
 * Created by dingpengfei on 2017/7/7.
 */
public class Order extends BaseEntity<Order> implements Serializable,Cloneable,Demo {
    private String orderCode;

    public Order(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }
}
