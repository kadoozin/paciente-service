package com.example.paciente_service.api.response;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.util.UUID;

public record PacienteResponse(
        UUID id,
        String nomeCompleto,

        @JsonFormat(pattern = "dd/MM/yyyy")
        LocalDate dataNascimento,

        String cpf,
        String rg
) {
}
