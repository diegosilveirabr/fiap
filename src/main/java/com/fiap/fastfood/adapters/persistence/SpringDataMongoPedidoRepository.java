package com.fiap.fastfood.adapters.persistence;

import com.fiap.fastfood.application.domain.Pedido;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataMongoPedidoRepository extends MongoRepository<Pedido, String> {

}
