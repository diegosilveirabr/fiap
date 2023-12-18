package com.fiap.fastfood.adapters.persistence;

import com.fiap.fastfood.application.domain.Order;
import com.fiap.fastfood.application.port.outgoing.SaveOrderPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class OrderRepository implements SaveOrderPort {

    private final SpringDataMongoOrderRepository repository;

    @Override
    public void saveOrder(Order order) {
        repository.save(order);
    }
}
