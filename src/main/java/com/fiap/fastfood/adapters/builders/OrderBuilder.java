package com.fiap.fastfood.adapters.builders;

import com.fiap.fastfood.adapters.web.request.CreateOrderRequest;
import com.fiap.fastfood.adapters.web.response.GetOrderResponse;
import com.fiap.fastfood.application.domain.Order;

public class OrderBuilder {

    public static GetOrderResponse fromDomainToResponse(Order order) {
        return GetOrderResponse.builder()
                .id(order.getId())
                .createdAt(order.getCreatedAt())
                .updatedAt(order.getUpdatedAt())
                .totalValue(order.getTotalValue())
                .items(order.getItems())
                .build();
    }

    public static Order fromRequestToDomain(CreateOrderRequest request) {
        return Order.builder()
                .items(request.getItems())
                .build();
    }
}
