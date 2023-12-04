package com.fiap.fastfood.application.domain;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    private String idProduto;
    private Integer quantidade;
    private BigDecimal valorItem;

    public BigDecimal getValorTotalItem() {
        return valorItem.multiply(BigDecimal.valueOf(quantidade));
    }
}