package com.example.mvc_crud_spring_boot.controller;

import com.example.mvc_crud_spring_boot.model.Product;
import com.example.mvc_crud_spring_boot.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.GetAllProducts();
    }

    @PostMapping
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @DeleteMapping("/{id}")
    public Product deleteProduct(@PathVariable Long id) {
        return productService.deleteProduct(id);
    }
}