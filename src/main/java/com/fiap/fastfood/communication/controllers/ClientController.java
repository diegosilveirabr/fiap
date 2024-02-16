package com.fiap.fastfood.communication.controllers;

import com.fiap.fastfood.core.usecase.ClientUseCaseImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RequiredArgsConstructor
@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientUseCaseImpl clientUseCaseImpl;

    @PostMapping
    public ResponseEntity<RegisterClientResponse> registerClient(@RequestBody RegisterClientRequest request)
            throws AlreadyRegisteredException {

        final var clientReq = ClientBuilder.fromRequestToDomain(request);
        final var client = clientUseCaseImpl.registerClient(clientReq);

        final var uri = URI.create(client.getId());
        return ResponseEntity.created(uri).body(new RegisterClientResponse(client.getId()));

    }

    @GetMapping
    public ResponseEntity<GetClientResponse> getClientByCpf(@RequestParam(required = true) String cpf)
            throws EntityNotFoundException {

        final var client = clientUseCaseImpl.getClientByCpf(cpf);
        final var clientResponse = ClientBuilder.fromDomainToResponse(client);

        return ResponseEntity.ok(clientResponse);
    }
}
