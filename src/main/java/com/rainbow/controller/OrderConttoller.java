package com.rainbow.controller;

import com.rainbow.commons.Result;
import com.rainbow.commons.StatusCode;
import com.rainbow.entity.Order;
import com.rainbow.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderConttoller {
    @Autowired
    private OrderService orderService;

    @GetMapping("/findAllOrder")
    public Result<List<Order>> findAllOrder() {
        return new Result<>(StatusCode.ok, true, orderService.findAllOrder(), "查询全部订单成功");
    }

    @PostMapping("/createOrder")
    public Result<String> createOrder(@RequestBody Order order) {
        orderService.createOrder(order);

        return new Result<>(StatusCode.ok, true, "订单添加成功.");
    }

    @DeleteMapping("/deleteOrderById/{orderId}")
    public Result<String> deleteOrderById(@PathVariable Integer orderId) {
        orderService.deleteById(orderId);

        return new Result<>(StatusCode.ok, true, "订单删除成功.");
    }

    @GetMapping("/findOrderByid/{orderId}")
    public Result<Order> findOrderById(@PathVariable Integer orderId) {
        Order order = orderService.findOrderById(orderId);

        return new Result<>(StatusCode.ok, true,  order, "根据订单id查询订单成功.");
    }
}
