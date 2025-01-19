package com.example.mvc_crud_spring_boot.repository;

import com.example.mvc_crud_spring_boot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}