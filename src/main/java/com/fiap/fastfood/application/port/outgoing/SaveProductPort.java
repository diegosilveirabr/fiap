package com.fiap.fastfood.application.port.outgoing;

import com.fiap.fastfood.application.domain.Product;

public interface SaveProductPort {
    Product saveProductPort(Product product);
}