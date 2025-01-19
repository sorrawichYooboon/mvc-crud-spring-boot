package com.example.mvc_crud_spring_boot.controller;

import com.example.mvc_crud_spring_boot.model.Category;
import com.example.mvc_crud_spring_boot.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/category")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @PostMapping
    public Category saveCategory(@RequestBody Category category) {
        return categoryService.saveCategory(category);
    }

    @DeleteMapping("/{id}")
    public Category deleteCategory(@PathVariable Long id) {
        return categoryService.deleteCategory(id);
    }
}