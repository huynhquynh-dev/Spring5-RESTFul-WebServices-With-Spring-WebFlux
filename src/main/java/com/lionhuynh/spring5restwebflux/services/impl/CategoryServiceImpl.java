package com.lionhuynh.spring5restwebflux.services.impl;

import com.lionhuynh.spring5restwebflux.model.Category;
import com.lionhuynh.spring5restwebflux.repositories.CategoryRepository;
import com.lionhuynh.spring5restwebflux.services.CategoryService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Flux<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Mono<Category> getCategoryById(String id) {
        return categoryRepository.findById(id);
    }
}
