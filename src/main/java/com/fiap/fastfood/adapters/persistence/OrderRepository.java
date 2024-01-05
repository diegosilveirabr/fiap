package com.fiap.fastfood.adapters.persistence;

import com.fiap.fastfood.application.domain.Order;
import com.fiap.fastfood.application.port.outgoing.ListOrderPort;
import com.fiap.fastfood.application.port.outgoing.SaveOrderPort;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class OrderRepository implements SaveOrderPort, ListOrderPort {

    private final SpringDataMongoOrderRepository repository;

    @Override
    public void saveOrder(Order order) {
        repository.save(order);
    }

    @Override
    public List<Order> listOrder() {
        return repository.findAll(Sort.by(Sort.Direction.DESC, "createdAt"));
    }
}
