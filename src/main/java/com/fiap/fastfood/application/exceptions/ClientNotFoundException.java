package com.fiap.fastfood.application.exceptions;

public class ClientNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ClientNotFoundException(String message) {
        super(message);

    }
}
