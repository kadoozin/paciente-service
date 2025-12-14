package com.example.paciente_service.api.response;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public record ConsultaResponse(
        UUID id,
        LocalDate dataConsulta,
        LocalTime horaConsulta,
        String descricao
) {
}
