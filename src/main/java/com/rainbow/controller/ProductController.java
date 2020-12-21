package com.rainbow.controller;

import com.rainbow.commons.Result;
import com.rainbow.commons.StatusCode;
import com.rainbow.entity.Product;
import com.rainbow.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/findAllProduct")
    public Result<List<Product>> findAllProduct() {
        return new Result<>(StatusCode.ok, true, productService.findAllProduct(), "查询全部商品成功");
    }

    @PostMapping("/createProduct")
    public Result<String> createProduct(@RequestBody Product user) {
        productService.createProduct(user);

        return new Result<>(StatusCode.ok, true, "商品添加成功.");
    }

    @DeleteMapping("/deleteProductById/{userId}")
    public Result<String> deleteProductById(@PathVariable Integer userId) {
        productService.deleteById(userId);

        return new Result<>(StatusCode.ok, true, "商品删除成功.");
    }

    @GetMapping("/findProductByid/{userId}")
    public Result<Product> findProductById(@PathVariable Integer userId) {
        Product user = productService.findProductById(userId);

        return new Result<>(StatusCode.ok, true,  user, "根据商品id查询商品成功.");
    }

    @PutMapping("/updateProduct")
    public Result<Product> updateProduct(@RequestBody Product user) {
        productService.updateProduct(user);

        return new Result<>(StatusCode.ok, true, "商品更新成功.");
    }
}
