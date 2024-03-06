package com.fiap.fastfood.common.dto.request;

import com.fiap.fastfood.core.entity.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CheckoutRequest {
    private List<Item> items;
}
