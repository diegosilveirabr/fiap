package com.fiap.fastfood.application.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Builder
@Data
@Document
public class Pedido {
    @Id
    private String id;
    private List<Item> itens;
    private BigDecimal valorTotal;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;

    public BigDecimal getValorTotal() {
        return itens.stream()
                .map(Item::getValorTotalItem)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
