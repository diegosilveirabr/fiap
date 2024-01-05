package com.fiap.fastfood.application.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document //TODO: acho que essas entidades de domínio não deveriam ser entidades
public class Order {

    @Id
    private String id;

    private List<Item> items;

    private BigDecimal totalValue;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    public BigDecimal getTotalValue() {
        return items.stream()
                .map(Item::getTotalItemValue)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
