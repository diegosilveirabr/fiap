package com.fiap.fastfood.adapters.persistence;

import com.fiap.fastfood.application.domain.Product;
import com.fiap.fastfood.application.domain.ProductTypeEnum;
import com.fiap.fastfood.application.exceptions.custom.EntityNotFoundException;
import com.fiap.fastfood.application.port.outgoing.DeleteProductPort;
import com.fiap.fastfood.application.port.outgoing.FindByTypePort;
import com.fiap.fastfood.application.port.outgoing.SaveProductPort;
import com.fiap.fastfood.application.port.outgoing.UpdateProductPort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@Component
public class ProductRepository implements SaveProductPort, DeleteProductPort, UpdateProductPort, FindByTypePort {

    @Autowired
    SpringDataMongoProductRepository repository;

    @Override
    public void deleteProductPort(String id) {
        repository.deleteById(id);
    }

    @Override
    public Product saveProductPort(Product product) {
        return repository.save(product);
    }

    @Override
    public Product updateProductPort(String id, Product product) {
        Optional<Product> existsProduct = repository.findById(id);

        if (existsProduct.isEmpty()) {
            return null;
        }

        Product newProduct = existsProduct.get();
        newProduct.setName(product.getName());
        newProduct.setPrice(product.getPrice());
        newProduct.setDescription(product.getDescription());
        newProduct.setType(product.getType());
        newProduct.setUpdatedAt(LocalDateTime.now());
        return repository.save(newProduct);
    }

    @Override
    public List<Product> findByType(ProductTypeEnum type) {
        return repository.findByType(type);
    }
}
