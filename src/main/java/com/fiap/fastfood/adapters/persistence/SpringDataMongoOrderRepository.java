package com.fiap.fastfood.adapters.persistence;

import com.fiap.fastfood.application.domain.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataMongoOrderRepository extends MongoRepository<Order, String> {

}
