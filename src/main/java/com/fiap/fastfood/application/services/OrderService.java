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

    @Autowired
    //TODO: acabei tendo que colocar o autowired porque ele não reconheceu o required args constructor, não sei se eu fiz algo errado
    private SaveOrderPort saveOrderPort;

    @Override
    public void createOrder(Order order) {
        saveOrderPort.saveOrder(order);
    }
}
