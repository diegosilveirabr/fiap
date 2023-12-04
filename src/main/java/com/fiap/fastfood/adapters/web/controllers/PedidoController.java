package com.fiap.fastfood.adapters.web.controllers;

import com.fiap.fastfood.adapters.web.request.CriarPedidoRequest;
import com.fiap.fastfood.application.port.incoming.CriarPedidoUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final CriarPedidoUseCase criarPedidoUseCase;

    @PostMapping
    public void criarPedido(@RequestBody CriarPedidoRequest request) {
        criarPedidoUseCase.criarPedido(request.getPedido());
    }
}
