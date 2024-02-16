package com.fiap.fastfood.common.beans;

import com.fiap.fastfood.common.interfaces.usecase.CheckoutUseCase;
import com.fiap.fastfood.common.interfaces.usecase.ClientUseCase;
import com.fiap.fastfood.common.interfaces.usecase.OrderUseCase;
import com.fiap.fastfood.common.interfaces.usecase.ProductUseCase;
import com.fiap.fastfood.core.usecase.CheckoutUseCaseImpl;
import com.fiap.fastfood.core.usecase.ClientUseCaseImpl;
import com.fiap.fastfood.core.usecase.OrderUseCaseImpl;
import com.fiap.fastfood.core.usecase.ProductUseCaseImpl;
import org.springframework.stereotype.Component;

@Component
public class GatewayBeanDeclaration {

    public CheckoutUseCase checkoutUseCase() {
        return new CheckoutUseCaseImpl();
    }

    public ClientUseCase clientUseCase() {
        return new ClientUseCaseImpl();
    }

    public OrderUseCase orderUseCase() {
        return new OrderUseCaseImpl();
    }

    public ProductUseCase productUseCase() {
        return new ProductUseCaseImpl();
    }
}
