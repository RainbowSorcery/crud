package com.rainbow.service;

import com.rainbow.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAllProduct();

    void createProduct(Product product);

    void deleteById(Integer productId);

    Product findProductById(Integer productId);

    void updateProduct(Product product);
}
