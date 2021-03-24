package com.lionhuynh.spring5restwebflux.services;

import com.lionhuynh.spring5restwebflux.model.Category;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CategoryService {

    Flux<Category> getAll();

    Mono<Category> getCategoryById(String id);
}
