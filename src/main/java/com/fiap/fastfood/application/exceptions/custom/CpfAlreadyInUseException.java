package com.fiap.fastfood.application.exceptions.custom;

import com.fiap.fastfood.application.exceptions.model.CustomException;

public class CpfAlreadyInUseException extends CustomException {

    private static final long serialVersionUID = 1L;

    public CpfAlreadyInUseException(String message) {
        super(message);

    }
}
