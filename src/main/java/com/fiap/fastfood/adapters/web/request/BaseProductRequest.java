package com.fiap.fastfood.adapters.web.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BaseProductRequest {
        String name;
        BigDecimal price;
        String description;
        String type;
}
