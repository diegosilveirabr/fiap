package com.fiap.fastfood.adapters.persistence;

import com.fiap.fastfood.application.domain.Pedido;
import com.fiap.fastfood.application.port.outgoing.SalvarPedidoPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class PedidoRepository implements SalvarPedidoPort {

    private final SpringDataMongoPedidoRepository repository;

    @Override
    public void salvarPedido(Pedido pedido) {
        repository.save(pedido);
    }
}
