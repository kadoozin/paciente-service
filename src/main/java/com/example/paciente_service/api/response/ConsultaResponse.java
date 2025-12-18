package com.example.paciente_service.api.response;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public record ConsultaResponse(
        UUID id,

        @JsonFormat(pattern = "dd/MM/yyyy")
        LocalDate dataConsulta,

        @JsonFormat(pattern = "HH:mm")
        LocalTime horaConsulta,

        String descricao
) {
}
