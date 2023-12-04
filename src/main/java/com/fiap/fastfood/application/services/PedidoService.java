package com.fiap.fastfood.application.services;

import com.fiap.fastfood.application.domain.Pedido;
import com.fiap.fastfood.application.port.incoming.CriarPedidoUseCase;
import com.fiap.fastfood.application.port.outgoing.SalvarPedidoPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PedidoService implements CriarPedidoUseCase {

    private final SalvarPedidoPort salvarPedidoPort;

    @Override
    public void criarPedido(Pedido pedido) {
        salvarPedidoPort.salvarPedido(pedido);
    }
}
