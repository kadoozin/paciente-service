package com.example.paciente_service.api.response;

import java.util.UUID;

public record ContatoResponse(
        UUID id,
        String email,
        String telefone
) {
}
