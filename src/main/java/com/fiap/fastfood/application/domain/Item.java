package com.fiap.fastfood.application.domain;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    private String idProduct;
    private Integer quantity;
    private BigDecimal itemValue;

    public BigDecimal getTotalItemValue() {
        return itemValue.multiply(BigDecimal.valueOf(quantity));
    }
}