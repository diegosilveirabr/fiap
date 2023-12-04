package com.fiap.fastfood.application.port.incoming;

import com.fiap.fastfood.application.domain.Pedido;

public interface CriarPedidoUseCase {
    void criarPedido(Pedido pedido);
}
