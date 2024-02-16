package com.fiap.fastfood.common.beans;

import com.fiap.fastfood.common.interfaces.datasources.SpringDataMongoCheckoutRepository;
import com.fiap.fastfood.common.interfaces.datasources.SpringDataMongoClientRepository;
import com.fiap.fastfood.common.interfaces.datasources.SpringDataMongoOrderRepository;
import com.fiap.fastfood.common.interfaces.datasources.SpringDataMongoProductRepository;
import com.fiap.fastfood.common.interfaces.gateways.CheckoutGateway;
import com.fiap.fastfood.common.interfaces.gateways.ClientGateway;
import com.fiap.fastfood.common.interfaces.gateways.OrderGateway;
import com.fiap.fastfood.common.interfaces.gateways.ProductGateway;
import com.fiap.fastfood.communication.gateways.CheckoutGatewayImpl;
import com.fiap.fastfood.communication.gateways.ClientGatewayImpl;
import com.fiap.fastfood.communication.gateways.OrderGatewayImpl;
import com.fiap.fastfood.communication.gateways.ProductGatewayImpl;
import org.springframework.stereotype.Component;

@Component
public class UseCaseBeanDeclaration {

    public CheckoutGateway checkoutGateway(SpringDataMongoCheckoutRepository repository) {
        return new CheckoutGatewayImpl(repository);
    }

    public ClientGateway clientGateway(SpringDataMongoClientRepository repository) {
        return new ClientGatewayImpl(repository);
    }

    public OrderGateway orderGateway(SpringDataMongoOrderRepository repository) {
        return new OrderGatewayImpl(repository);
    }

    public ProductGateway productGateway(SpringDataMongoProductRepository repository) {
        return new ProductGatewayImpl(repository);
    }
}
