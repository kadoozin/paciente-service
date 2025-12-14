package com.example.paciente_service.api.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.UUID;

public record ContatoRequest(
        @NotBlank
        @Email
        String email,

        @NotBlank
        @Size(min = 8, max = 20)
        String telefone,

        @NotNull
        UUID pacienteId
) {
}
