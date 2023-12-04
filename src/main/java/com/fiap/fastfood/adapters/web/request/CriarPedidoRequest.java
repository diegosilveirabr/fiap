package com.fiap.fastfood.adapters.web.request;

import com.fiap.fastfood.application.domain.Pedido;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CriarPedidoRequest {
    private Pedido pedido;
}
