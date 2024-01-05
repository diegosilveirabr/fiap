package com.fiap.fastfood.application.services;

import com.fiap.fastfood.application.domain.Product;
import com.fiap.fastfood.application.domain.ProductTypeEnum;
import com.fiap.fastfood.application.port.incoming.ProductUseCase;
import com.fiap.fastfood.application.port.outgoing.DeleteProductPort;
import com.fiap.fastfood.application.port.outgoing.FindByTypePort;
import com.fiap.fastfood.application.port.outgoing.SaveProductPort;
import com.fiap.fastfood.application.port.outgoing.UpdateProductPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements ProductUseCase {

    private final SaveProductPort saveProduct;

    private final DeleteProductPort deleteProduct;

    private final UpdateProductPort updateProduct;

    private final FindByTypePort findByTypePort;

    @Override
    public Product createProduct(Product product) {
        return saveProduct.saveProductPort(product);
    }

    @Override
    public Product updateProduct(String id, Product product) {
        return updateProduct.updateProductPort(id, product);

    }

    @Override
    public void deleteProduct(String id) {
        deleteProduct.deleteProductPort(id);
    }

    @Override
    public List<Product> findByType(ProductTypeEnum type) {
        return findByTypePort.findByType(type);
    }


}
