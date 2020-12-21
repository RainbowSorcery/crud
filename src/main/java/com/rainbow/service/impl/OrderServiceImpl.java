package com.rainbow.service.impl;

import com.rainbow.dao.OrderMapper;
import com.rainbow.entity.Order;
import com.rainbow.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void createOrder(Order order) {
        orderMapper.addOrder(order);
    }

    @Override
    public void deleteById(Integer orderId) {
        orderMapper.deleteById(orderId);
    }

    @Override
    public Order findOrderById(Integer orderId) {
        return orderMapper.findOrderById(orderId);
    }


    @Override
    public List<Order> findAllOrder() {
        return orderMapper.findAll();
    }
}
