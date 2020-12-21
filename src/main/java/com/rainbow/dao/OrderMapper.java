package com.rainbow.dao;

import com.rainbow.entity.Order;
import com.rainbow.entity.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper {
    @Select("select * from `order`")
    List<Order> findAll();

    @Insert("INSERT INTO `order`(id) VALUES(#{id})")
    void addOrder(Order order);


    @Delete("delete FROM `order` WHERE id = #{orderId}")
    void deleteById(Integer orderId);

    @Select("SELECT * FROM `order` WHERE id = #{orderId}")
    Order findOrderById(Integer orderId);
}
