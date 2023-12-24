package com.fiap.fastfood.application.services;

import com.fiap.fastfood.application.domain.Client;
import com.fiap.fastfood.application.port.incoming.GetClientByCpfUseCase;
import com.fiap.fastfood.application.port.incoming.RegisterClientUseCase;
import com.fiap.fastfood.application.port.outgoing.GetClientByCpfPort;
import com.fiap.fastfood.application.port.outgoing.SaveClientPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientService implements RegisterClientUseCase, GetClientByCpfUseCase {

    private final SaveClientPort saveClientPort;

    private final GetClientByCpfPort getClientByCpfPort;

    @Override
    public Client registerClient(Client client) {
        final var


        return saveClientPort.saveClient(client);
    }

    @Override
    public Client getClientByCpf(String cpf) {
        return getClientByCpfPort.getClientByCpf(cpf);
    }
}
