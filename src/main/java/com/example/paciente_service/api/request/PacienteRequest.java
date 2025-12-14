package com.example.paciente_service.api.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

public record PacienteRequest(
        @NotBlank
        String nomeCompleto,

        @NotNull
        @Past
        LocalDate dataNascimento,

        @NotBlank
        @CPF
        String cpf,

        @NotBlank
        String rg
) {
}
