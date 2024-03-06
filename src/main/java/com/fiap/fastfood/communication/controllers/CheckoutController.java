package com.fiap.fastfood.communication.controllers;

import com.fiap.fastfood.common.builders.CheckoutBuilder;
import com.fiap.fastfood.common.builders.OrderBuilder;
import com.fiap.fastfood.common.dto.request.CheckoutRequest;
import com.fiap.fastfood.common.dto.response.CheckoutResponse;
import com.fiap.fastfood.common.interfaces.gateways.CheckoutGateway;
import com.fiap.fastfood.common.interfaces.gateways.OrderGateway;
import com.fiap.fastfood.common.interfaces.usecase.CheckoutUseCase;
import com.fiap.fastfood.common.interfaces.usecase.OrderUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/checkout")
public class CheckoutController {

    private final CheckoutGateway checkoutGateway;
    private final OrderGateway orderGateway;

    private final CheckoutUseCase checkoutUseCase;
    private final OrderUseCase orderUseCase;

    public CheckoutController(CheckoutGateway checkoutGateway, OrderGateway orderGateway, CheckoutUseCase checkoutUseCase, OrderUseCase orderUseCase) {
        this.checkoutGateway = checkoutGateway;
        this.orderGateway = orderGateway;
        this.checkoutUseCase = checkoutUseCase;
        this.orderUseCase = orderUseCase;
    }

    @PostMapping
    public CheckoutResponse checkout(@RequestBody CheckoutRequest request) {
        var order = orderUseCase.createOrder(OrderBuilder.fromRequestToDomain(request), orderGateway);
        var checkoutReq = CheckoutBuilder.fromRequestToDomain(order.getId());
        final var checkoutResponse = checkoutUseCase.submit(checkoutReq, checkoutGateway);
        return CheckoutBuilder.fromDomainToResponse(checkoutResponse);
    }

    @GetMapping
    public ResponseEntity<List<CheckoutResponse>> findAll() {
        final var result = checkoutUseCase.findAll(checkoutGateway);

        return ResponseEntity.ok(result.stream()
                .map(CheckoutBuilder::fromDomainToResponse)
                .collect(Collectors.toList()));
    }
}
