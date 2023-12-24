package com.fiap.fastfood.application.domain;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Accessors(chain = true)
@Data
@Document //TODO: acho que essas entidades de domínio não deveriam ser entidades
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
