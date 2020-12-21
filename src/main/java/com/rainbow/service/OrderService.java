package com.rainbow.service;

import com.rainbow.entity.Order;

import java.util.List;

public interface OrderService {
    void createOrder(Order order);

    void deleteById(Integer orderId);

    Order findOrderById(Integer orderId);


    List<Order> findAllOrder();
}
