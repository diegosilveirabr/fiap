package com.fiap.fastfood.common.dto.request;

import com.fiap.fastfood.core.entity.Item;
import com.fiap.fastfood.core.entity.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderRequest {
    private OrderStatus status;
    private List<Item> items;
}
