package com.fiap.fastfood.adapters.persistence;

import com.fiap.fastfood.application.domain.Client;
import com.fiap.fastfood.application.port.outgoing.GetClientByCpfPort;
import com.fiap.fastfood.application.port.outgoing.SaveClientPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ClientRepository implements SaveClientPort, GetClientByCpfPort {

    private final SpringDataMongoClientRepository repository;

    @Override
    public Client saveClient(Client client) {
        return repository.save(client);
    }

    @Override
    public Client getClientByCpf(String cpf) {
        return repository.findByCpf(cpf);
    }
}
