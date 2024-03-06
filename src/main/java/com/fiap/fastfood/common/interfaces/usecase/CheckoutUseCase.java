package com.fiap.fastfood.common.interfaces.usecase;

import com.fiap.fastfood.common.interfaces.gateways.CheckoutGateway;
import com.fiap.fastfood.core.entity.Checkout;

import java.util.List;

public interface CheckoutUseCase {

    Checkout submit(Checkout checkout, CheckoutGateway checkoutGateway);

    List<Checkout> findAll(CheckoutGateway checkoutGateway);
}
