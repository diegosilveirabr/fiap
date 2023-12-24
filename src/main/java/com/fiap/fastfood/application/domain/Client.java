package com.fiap.fastfood.application.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;


@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
//@Document
public class Client extends Person {

    @MongoId
    private String id;
}
