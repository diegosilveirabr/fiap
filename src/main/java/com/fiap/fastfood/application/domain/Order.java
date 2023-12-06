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
public class Order {
    @Id
    private String id;
    private List<Item> itens;
    private BigDecimal totalValue;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public BigDecimal getTotalValue() {
        return itens.stream()
                .map(Item::getTotalItemValue)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
