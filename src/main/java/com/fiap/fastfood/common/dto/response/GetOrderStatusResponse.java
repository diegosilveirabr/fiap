package com.fiap.fastfood.common.dto.response;

import com.fiap.fastfood.core.entity.OrderStatus;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetOrderStatusResponse {
    private OrderStatus status;
}
