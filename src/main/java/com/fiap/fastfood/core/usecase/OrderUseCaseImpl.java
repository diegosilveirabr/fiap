package com.fiap.fastfood.core.usecase;

import com.fiap.fastfood.common.exceptions.custom.EntityNotFoundException;
import com.fiap.fastfood.common.interfaces.gateways.OrderGateway;
import com.fiap.fastfood.common.interfaces.usecase.OrderUseCase;
import com.fiap.fastfood.core.entity.Order;

import java.util.List;

public class OrderUseCaseImpl implements OrderUseCase {

    @Override
    public void createOrder(Order order, OrderGateway orderGateway) {
        orderGateway.saveOrder(order);
    }

    @Override
    public List<Order> listOrder(OrderGateway orderGateway) {
        return orderGateway.listOrder();
    }

    @Override
    public Order getOrderById(String id, OrderGateway orderGateway) throws EntityNotFoundException {
        return orderGateway.getOrderById(id);
    }
}
