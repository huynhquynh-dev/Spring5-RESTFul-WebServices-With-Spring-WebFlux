package com.lionhuynh.spring5restwebflux.repositories;

import com.lionhuynh.spring5restwebflux.model.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CategoryRepository extends ReactiveMongoRepository<Category, String> {
}
