package com.example.mvc_crud_spring_boot.repository;

import com.example.mvc_crud_spring_boot.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {}