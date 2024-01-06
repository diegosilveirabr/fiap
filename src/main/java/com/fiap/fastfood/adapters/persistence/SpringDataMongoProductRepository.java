package com.fiap.fastfood.adapters.persistence;

import com.fiap.fastfood.application.domain.Product;
import com.fiap.fastfood.application.domain.ProductTypeEnum;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpringDataMongoProductRepository extends MongoRepository<Product, String> {

    List<Product> findByType(ProductTypeEnum type);
}
