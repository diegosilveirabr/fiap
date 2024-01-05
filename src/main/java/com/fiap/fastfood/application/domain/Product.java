package com.fiap.fastfood.application.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Data
@Document
public class Product {
    @MongoId
    private String id;
    private String name;
    private BigDecimal price;
    private String description;
    private ProductTypeEnum type;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
