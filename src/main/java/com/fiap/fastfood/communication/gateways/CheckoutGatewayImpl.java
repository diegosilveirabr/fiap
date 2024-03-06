package com.fiap.fastfood.communication.gateways;

import com.fiap.fastfood.common.builders.CheckoutBuilder;
import com.fiap.fastfood.common.interfaces.datasources.SpringDataMongoCheckoutRepository;
import com.fiap.fastfood.common.interfaces.gateways.CheckoutGateway;
import com.fiap.fastfood.core.entity.Checkout;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;


@Repository
public class CheckoutGatewayImpl implements CheckoutGateway {

    private final SpringDataMongoCheckoutRepository springDataMongoCheckoutRepository;

    public CheckoutGatewayImpl(SpringDataMongoCheckoutRepository springDataMongoCheckoutRepository) {
        this.springDataMongoCheckoutRepository = springDataMongoCheckoutRepository;
    }

    @Override
    public Checkout save(Checkout checkout) {
        final var orm = CheckoutBuilder.fromDomainToOrm(checkout);
        final var checkoutORM = springDataMongoCheckoutRepository.save(orm);
        return CheckoutBuilder.fromOrmToDomain(checkoutORM);
    }

    @Override
    public List<Checkout> findAll() {
        final var orms = springDataMongoCheckoutRepository.findAllByOrderByCreatedAtAsc();
        final var checkouts = orms.stream().map(orm -> CheckoutBuilder.fromOrmToDomain(orm)).collect(Collectors.toList());
        return checkouts;
    }
}
