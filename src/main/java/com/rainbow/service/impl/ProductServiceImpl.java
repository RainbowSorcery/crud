package com.rainbow.service.impl;

import com.rainbow.dao.ProductMapper;
import com.rainbow.entity.Product;
import com.rainbow.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> findAllProduct() {
        return productMapper.findAll();
    }

    @Override
    public void createProduct(Product product) {
        productMapper.addUser(product);
    }

    @Override
    public void deleteById(Integer productId) {
        productMapper.deleteById(productId);
    }

    @Override
    public Product findProductById(Integer productId) {
        return productMapper.findUserById(productId);
    }

    @Override
    public void updateProduct(Product product) {
        productMapper.updateUser(product);
    }
}
