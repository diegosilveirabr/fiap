package com.fiap.fastfood.application.services;

import com.fiap.fastfood.application.domain.Client;
import com.fiap.fastfood.application.port.incoming.GetClientByCpfUseCase;
import com.fiap.fastfood.application.port.incoming.RegisterClientUseCase;
import com.fiap.fastfood.application.port.outgoing.SaveOrderPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientService implements RegisterClientUseCase, GetClientByCpfUseCase {

    private final SaveOrderPort saveOrderPort;

    @Override
    public Client registerClient(Client client) {
        return null; //TODO
    }

    @Override
    public Client getClientByCpf(String cpf) {
        return null; //TODO
    }
}
