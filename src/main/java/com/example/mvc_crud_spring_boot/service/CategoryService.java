package com.example.mvc_crud_spring_boot.service;

import com.example.mvc_crud_spring_boot.model.Category;
import com.example.mvc_crud_spring_boot.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Category deleteCategory(Long id) {
        Category category = categoryRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid category Id:" + id));
        categoryRepository.delete(category);
        return category;
    }
}