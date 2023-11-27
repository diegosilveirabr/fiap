package com.fiap.fastfood.infrastracture.database.models;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Data
@Document
public class Order {
    @Id
    private String id;
}
