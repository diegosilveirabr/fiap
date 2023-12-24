package com.fiap.fastfood.application.exceptions;

public class CpfAlreadyInUseException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public CpfAlreadyInUseException(String message) {
        super(message);

    }
}
