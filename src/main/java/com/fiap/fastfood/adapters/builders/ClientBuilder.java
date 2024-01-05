package com.fiap.fastfood.adapters.builders;

import com.fiap.fastfood.adapters.web.request.RegisterClientRequest;
import com.fiap.fastfood.adapters.web.response.GetClientResponse;
import com.fiap.fastfood.application.domain.Client;

import java.time.LocalDateTime;

public class ClientBuilder {

    public static Client fromRequestToDomain(RegisterClientRequest request) {
        return (Client) new Client()
                .setName(request.getName())
                .setBirthday(request.getBirthday())
                .setCpf(request.getCpf())
                .setCreationTimestamp(LocalDateTime.now())
                .setEmail(request.getEmail());
    }

    public static GetClientResponse fromDomainToResponse(Client client) {
        return new GetClientResponse()
                .setId(client.getId())
                .setName(client.getName())
                .setBirthday(client.getBirthday())
                .setCpf(client.getCpf())
                .setEmail(client.getEmail())
                .setCreationTimestamp(client.getCreationTimestamp())
                .setUpdateTimestamp(client.getUpdateTimestamp());
    }
}
