package com.fiap.fastfood.application.port.incoming;

import com.fiap.fastfood.infrastracture.database.models.Order;

public interface CreateOrderPort {
    void createOrder(Order order);
}
