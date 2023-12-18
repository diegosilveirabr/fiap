package com.fiap.fastfood.application.port.incoming;

import com.fiap.fastfood.application.domain.Client;

public interface RegisterClientUseCase {
    Client registerClient(Client client);
}
