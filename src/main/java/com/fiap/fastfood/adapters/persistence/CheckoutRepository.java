package com.fiap.fastfood.adapters.persistence;

import com.fiap.fastfood.application.domain.Checkout;
import com.fiap.fastfood.application.port.outgoing.CheckoutPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@RequiredArgsConstructor
public class CheckoutRepository implements CheckoutPort {

    private final SpringDataMongoCheckoutRepository springDataMongoCheckoutRepository;

    @Override
    public void save(Checkout checkout) {
        springDataMongoCheckoutRepository.save(checkout);
    }

    @Override
    public List<Checkout> findAll() {
        return springDataMongoCheckoutRepository.findAllByOrderByCreatedAtAsc();
    }
}
