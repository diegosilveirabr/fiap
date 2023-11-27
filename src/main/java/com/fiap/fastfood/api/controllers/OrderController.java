package com.fiap.fastfood.api.controllers;

import com.fiap.fastfood.api.request.CreateOrderRequest;
import com.fiap.fastfood.application.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public void createOrder(@RequestBody CreateOrderRequest request) {
        // TODO: 27/11/23 Impl call para a service
        //orderService.createOrder();
    }
}
