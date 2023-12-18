package com.fiap.fastfood.application.services;

import com.fiap.fastfood.application.domain.Order;
import com.fiap.fastfood.application.port.incoming.CreateOrderUseCase;
import com.fiap.fastfood.application.port.outgoing.SaveOrderPort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService implements CreateOrderUseCase {

   private final SaveOrderPort saveOrderPort;

    @Override
    public void createOrder(Order order) {
        saveOrderPort.saveOrder(order);
    }
}
