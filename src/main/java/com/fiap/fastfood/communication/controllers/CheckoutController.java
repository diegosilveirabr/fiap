package com.fiap.fastfood.communication.controllers;

import com.fiap.fastfood.common.interfaces.usecase.CheckoutUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/checkout")
@RequiredArgsConstructor
public class CheckoutController {

    private final CheckoutUseCase checkoutUseCase;

    @PostMapping
    public void checkout(@RequestBody CheckoutRequest request) {
        checkoutUseCase.submit(CheckoutBuilder.fromRequestToDomain(request));
    }

    @GetMapping
    public ResponseEntity<List<CheckoutResponse>> findAll() {
        return ResponseEntity.ok(checkoutUseCase.findAll().stream()
                .map(CheckoutBuilder::fromDomainToResponse)
                .collect(Collectors.toList()));
    }
}
