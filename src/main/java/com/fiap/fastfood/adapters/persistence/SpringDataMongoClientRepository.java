package com.fiap.fastfood.adapters.persistence;

import com.fiap.fastfood.application.domain.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataMongoClientRepository extends MongoRepository<Client, String> {

}
