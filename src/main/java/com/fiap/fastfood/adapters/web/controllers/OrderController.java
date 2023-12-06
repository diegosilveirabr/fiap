package com.fiap.fastfood.adapters.web.controllers;


import com.fiap.fastfood.adapters.web.request.CreateOrderRequest;
import com.fiap.fastfood.application.port.incoming.CreateOrderUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired //TODO: acabei tendo que colocar o autowired porque ele não reconheceu o required args constructor, não sei se eu fiz algo errado
    private CreateOrderUseCase createOrderUseCase;

    @PostMapping
    public void criarOrder(@RequestBody CreateOrderRequest request) {
        //createOrderUseCase.createOrder(request());
    }
}
