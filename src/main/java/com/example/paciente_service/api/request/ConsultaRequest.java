package com.example.paciente_service.api.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public record ConsultaRequest(
        @NotNull
        LocalDate dataConsulta,

        @NotNull
        LocalTime horaConsulta,

        @NotBlank
        @Size(max = 2000)
        String descricao,

        @NotNull
        UUID pacienteId
) {
}
