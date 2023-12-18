package com.fiap.fastfood.application.port.outgoing;

import com.fiap.fastfood.application.domain.Client;

public interface SaveClientPort {
    void saveClient(Client client);
}
