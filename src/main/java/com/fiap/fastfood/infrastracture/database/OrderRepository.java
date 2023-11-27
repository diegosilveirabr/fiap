package com.fiap.fastfood.infrastracture.database;

import com.fiap.fastfood.infrastracture.database.models.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {

}
