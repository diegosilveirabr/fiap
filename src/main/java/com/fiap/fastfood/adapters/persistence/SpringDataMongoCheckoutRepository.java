package com.fiap.fastfood.adapters.persistence;

import com.fiap.fastfood.application.domain.Checkout;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpringDataMongoCheckoutRepository extends MongoRepository<Checkout, String> {
    List<Checkout> findAllByOrderByCreatedAtAsc();
}
