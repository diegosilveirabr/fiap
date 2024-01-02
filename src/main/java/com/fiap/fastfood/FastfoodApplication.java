package com.fiap.fastfood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableMongoAuditing
@SpringBootApplication
public class FastfoodApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastfoodApplication.class, args);
    }

}
