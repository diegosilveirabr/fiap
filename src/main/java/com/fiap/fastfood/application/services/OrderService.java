package com.fiap.fastfood.application.services;

import com.fiap.fastfood.application.port.incoming.CreateOrderPort;
import com.fiap.fastfood.infrastracture.database.models.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final CreateOrderPort createOrderPort;

    public void createOrder(Order order) {
        createOrderPort.createOrder(order);
    }
}
