package com.fiap.fastfood.adapters.builders;

import com.fiap.fastfood.adapters.web.request.BaseProductRequest;
import com.fiap.fastfood.adapters.web.request.BaseProductResponse;
import com.fiap.fastfood.adapters.web.request.CreateProductRequest;
import com.fiap.fastfood.adapters.web.request.UpdateProductRequest;
import com.fiap.fastfood.application.domain.Product;
import com.fiap.fastfood.application.domain.ProductTypeEnum;

import java.time.LocalDateTime;

public class ProductBuilder {

    public static Product toDomain(CreateProductRequest request) {
        return buildCreateProductFromRequest(request);
    }

    public static Product toDomain(UpdateProductRequest request, LocalDateTime timestamp) {
        return buildProductFromRequest(request, LocalDateTime.now());
    }

    public static BaseProductResponse toResponse(Product product) {
        return BaseProductResponse
                .builder()
                .name(product.getName())
                .description(product.getDescription())
                .type(product.getType().toString())
                .price(product.getPrice())
                .createdAt(product.getCreatedAt())
                .updatedAt(product.getUpdatedAt())
                .build();
    }

    private static <BaseProductRequest> Product buildCreateProductFromRequest(CreateProductRequest request) {
        return Product.builder()
                .name(request.getName())
                .price(request.getPrice())
                .description(request.getDescription())
                .type(ProductTypeEnum.valueOf(request.getType()))
                .createdAt(LocalDateTime.now())
                .updatedAt(null)
                .build();
    }

    private static <BaseProductRequest> Product buildProductFromRequest(UpdateProductRequest request, LocalDateTime updatedAt) {
        return Product.builder()
                .name(request.getName())
                .price(request.getPrice())
                .description(request.getDescription())
                .type(ProductTypeEnum.valueOf(request.getType()))
                .updatedAt(updatedAt)
                .build();
    }
}
