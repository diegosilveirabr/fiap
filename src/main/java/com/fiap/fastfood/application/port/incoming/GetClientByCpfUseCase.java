package com.fiap.fastfood.application.port.incoming;

import com.fiap.fastfood.application.domain.Client;

public interface GetClientByCpfUseCase {
    Client getClientByCpf(String cpf);
}
