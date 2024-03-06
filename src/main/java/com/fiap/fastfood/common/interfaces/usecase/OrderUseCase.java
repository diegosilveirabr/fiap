package com.fiap.fastfood.common.interfaces.usecase;

import com.fiap.fastfood.common.exceptions.custom.EntityNotFoundException;
import com.fiap.fastfood.common.interfaces.gateways.OrderGateway;
import com.fiap.fastfood.core.entity.Order;
import com.fiap.fastfood.core.entity.OrderStatus;

import java.util.List;

public interface OrderUseCase {

    Order createOrder(Order order, OrderGateway orderGateway);

    Order updateStatus(String id, OrderStatus status, OrderGateway orderGateway) throws EntityNotFoundException;

    List<Order> listOrder(OrderGateway orderGateway);

    Order getOrderById(String id, OrderGateway orderGateway) throws EntityNotFoundException;

}
