package com.fiap.fastfood.adapters.builders;

import com.fiap.fastfood.adapters.web.request.CheckoutRequest;
import com.fiap.fastfood.adapters.web.request.CreateOrderRequest;
import com.fiap.fastfood.adapters.web.response.CheckoutResponse;
import com.fiap.fastfood.adapters.web.response.GetOrderResponse;
import com.fiap.fastfood.application.domain.Checkout;
import com.fiap.fastfood.application.domain.Order;

public class CheckoutBuilder {



    public static Checkout fromRequestToDomain(CheckoutRequest request) {
        return Checkout.builder()
                .status("In Progress")
                .orderId(request.getOrderId())
                .build();
    }

    public static CheckoutResponse fromDomainToResponse(Checkout checkout) {
        return CheckoutResponse.builder()
                .id(checkout.getId())
                .status(checkout.getStatus())
                .orderId(checkout.getOrderId())
                .createAt(checkout.getCreatedAt())
                .build();
    }
}
