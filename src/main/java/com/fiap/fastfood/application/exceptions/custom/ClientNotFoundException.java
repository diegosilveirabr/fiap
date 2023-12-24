package com.fiap.fastfood.application.exceptions.custom;

import com.fiap.fastfood.application.exceptions.model.CustomException;

public class ClientNotFoundException extends CustomException {

    private static final long serialVersionUID = 1L;

    public ClientNotFoundException(String message) {
        super(message);

    }
}
