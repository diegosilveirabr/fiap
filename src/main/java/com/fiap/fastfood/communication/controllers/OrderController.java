package com.fiap.fastfood.communication.controllers;

import com.fiap.fastfood.common.builders.OrderBuilder;
import com.fiap.fastfood.common.dto.request.CreateOrderRequest;
import com.fiap.fastfood.common.dto.response.OrderResponse;
import com.fiap.fastfood.common.dto.response.OrderPaymentStatusResponse;
import com.fiap.fastfood.common.exceptions.custom.EntityNotFoundException;
import com.fiap.fastfood.common.interfaces.gateways.OrderGateway;
import com.fiap.fastfood.common.interfaces.usecase.OrderUseCase;
import com.fiap.fastfood.core.entity.OrderStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderGateway gateway;
    private final OrderUseCase useCase;

    public OrderController(OrderGateway orderGateway, OrderUseCase orderUseCase) {
        this.gateway = orderGateway;
        this.useCase = orderUseCase;
    }

    @PostMapping
    public void createOrder(@RequestBody CreateOrderRequest request) {
        useCase.createOrder(OrderBuilder.fromRequestToDomain(request), gateway);
    }

    @PutMapping("/{orderId}/update-status")
    public ResponseEntity<OrderResponse> updateOrderStatus(@PathVariable String orderId, @RequestParam OrderStatus status) throws EntityNotFoundException {
        var order = useCase.updateStatus(orderId, status,gateway);
        return ResponseEntity.ok(OrderBuilder.fromDomainToResponse(order));
     }

    @GetMapping
    public ResponseEntity<List<OrderResponse>> getOrders() {
        final var result = useCase.listOrder(gateway);

        return ResponseEntity.ok(result.stream()
                .map(OrderBuilder::fromDomainToResponse)
                .collect(Collectors.toList()));
    }

    @GetMapping("/{orderId}/payment-status")
    public ResponseEntity<OrderPaymentStatusResponse> getOrderPaymentStatus(@PathVariable String orderId) throws EntityNotFoundException {
        return ResponseEntity.ok(OrderPaymentStatusResponse.builder()
                .paymentStatus(useCase.getOrderById(orderId, gateway).getPaymentStatus())
                .build());
    }

}
