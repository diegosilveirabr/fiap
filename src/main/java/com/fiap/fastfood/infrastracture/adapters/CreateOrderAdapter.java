package com.fiap.fastfood.infrastracture.adapters;

import com.fiap.fastfood.application.port.incoming.CreateOrderPort;
import com.fiap.fastfood.infrastracture.database.OrderRepository;
import com.fiap.fastfood.infrastracture.database.models.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CreateOrderAdapter implements CreateOrderPort {

    private final OrderRepository orderRepository;

    @Override
    public void createOrder(Order order) {
        orderRepository.save(order);
    }
}
