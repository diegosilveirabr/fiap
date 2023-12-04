package com.fiap.fastfood.application.port.outgoing;

import com.fiap.fastfood.application.domain.Pedido;

public interface SalvarPedidoPort {
    void salvarPedido(Pedido pedido);
}
