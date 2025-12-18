package com.example.paciente_service.api.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public record ConsultaRequest(
        @NotNull
        @JsonFormat(pattern = "dd/MM/yyyy")
        LocalDate dataConsulta,

        @NotNull
        @JsonFormat(pattern = "HH:mm")
        LocalTime horaConsulta,

        @NotBlank
        @Size(max = 2000)
        String descricao,

        @NotNull
        UUID pacienteId
) {
}
