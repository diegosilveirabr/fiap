package com.fiap.fastfood.core.usecase;

import com.fiap.fastfood.common.interfaces.gateways.ClientGateway;
import com.fiap.fastfood.common.interfaces.usecase.ClientUseCase;
import com.fiap.fastfood.core.entity.Client;
import com.fiap.fastfood.common.exceptions.custom.EntityNotFoundException;

public class ClientUseCaseImpl implements ClientUseCase {

    @Override
    public Client registerClient(Client client, ClientGateway clientGateway) {
        final var validationResult = Client.validate(client);

        if (!validationResult.getIsValid()) {
            /*throw new AlreadyRegisteredException(
                    "CLIENT-01",
                    "Couldn't complete registration for client.",
                    validationResult.getErrors()
            );*/
        }

        return clientGateway.saveClient(client);
    }

    @Override
    public Client getClientByCpf(String cpf, ClientGateway clientGateway) throws EntityNotFoundException {
        final var client = clientGateway.getClientByCpf(cpf);

        if (client == null) {
            throw new EntityNotFoundException(
                    "CLIENT-02",
                    "Client not found."
            );
        }

        return client;
    }
}
