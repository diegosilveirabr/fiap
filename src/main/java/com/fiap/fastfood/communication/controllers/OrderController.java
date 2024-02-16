package com.fiap.fastfood.communication.controllers;

import com.fiap.fastfood.core.usecase.OrderUseCaseImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderUseCaseImpl orderService;

    @PostMapping
    public void createOrder(@RequestBody CreateOrderRequest request) {
        orderService.createOrder(OrderBuilder.fromRequestToDomain(request));
    }

    @GetMapping
    public ResponseEntity<List<GetOrderResponse>> getOrders() {
        return ResponseEntity.ok(orderService.listOrder().stream()
                .map(OrderBuilder::fromDomainToResponse)
                .collect(Collectors.toList()));
    }
}
