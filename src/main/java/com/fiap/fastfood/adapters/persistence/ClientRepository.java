package com.fiap.fastfood.adapters.persistence;

import com.fiap.fastfood.application.domain.Client;
import com.fiap.fastfood.application.port.outgoing.SaveClientPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ClientRepository implements SaveClientPort {

    private final SpringDataMongoClientRepository repository;

    @Override
    public void saveClient(Client client) {
        repository.save(client);
    }
}
