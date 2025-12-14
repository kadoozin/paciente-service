package com.example.paciente_service.api.response;

import java.time.LocalDate;
import java.util.UUID;

public record PacienteResponse(
        UUID id,
        String nomeCompleto,
        LocalDate dataNascimento,
        String cpf,
        String rg
) {
}
