package com.rainbow.dao;

import com.rainbow.entity.Product;
import com.rainbow.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper {
    @Select("select * from product")
    List<Product> findAll();

    @Insert("INSERT INTO `product`(product_name, product_details, spec, price) VALUES(#{productName}, #{productDetails}, #{spec}, #{price})")
    void addUser(Product product);


    @Delete("delete FROM product WHERE id = #{userId}")
    void deleteById(Integer userId);

    @Select("SELECT * FROM product WHERE id = #{userId}")
    Product findUserById(Integer userId);

    @Update("update product SET product_name = #{productName}, product_details = #{productDetails}, spec = #{spec}, price = #{price} WHERE id = #{id}")
    void updateUser(Product product);
}
