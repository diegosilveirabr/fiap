package com.fiap.fastfood.application.validators;

public interface CustomValidator<T> {
    ValidationResult validate(T object);
}
