package com.fiap.fastfood.core.usecase;

import com.fiap.fastfood.common.exceptions.custom.EntityNotFoundException;
import com.fiap.fastfood.common.interfaces.gateways.OrderGateway;
import com.fiap.fastfood.common.interfaces.usecase.OrderUseCase;
import com.fiap.fastfood.core.entity.Order;
import com.fiap.fastfood.core.entity.OrderPaymentStatus;
import com.fiap.fastfood.core.entity.OrderStatus;

import java.util.List;

public class OrderUseCaseImpl implements OrderUseCase {

    @Override
    public Order createOrder(Order order, OrderGateway orderGateway) {
        order.setStatus(OrderStatus.RECEIVED);
        order.setPaymentStatus(OrderPaymentStatus.PENDING);
        return orderGateway.saveOrder(order);
    }

    @Override
    public Order updateStatus(String id, OrderStatus status, OrderGateway orderGateway) throws EntityNotFoundException {
        Order order = orderGateway.getOrderById(id);
        order.setStatus(status);
        orderGateway.saveOrder(order);
        return order;
    }

    @Override
    public List<Order> listOrder(OrderGateway orderGateway) {
        return orderGateway.listOrder();
    }

    @Override
    public Order getOrderById(String id, OrderGateway orderGateway) throws EntityNotFoundException {
        return orderGateway.getOrderById(id);
    }

    @Override
    public void approveOrder(String id, OrderGateway orderGateway) throws EntityNotFoundException {
        orderGateway.approveOrder(id);
    }

    @Override
    public void rejectOrder(String id, OrderGateway orderGateway) throws EntityNotFoundException {
        orderGateway.rejectedOrder(id);
    }
}
