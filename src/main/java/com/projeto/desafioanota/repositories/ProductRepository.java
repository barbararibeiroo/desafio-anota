package com.projeto.desafioanota.repositories;

import com.projeto.desafioanota.domain.category.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Category, String> {
}
