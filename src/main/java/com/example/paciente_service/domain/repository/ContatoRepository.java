package com.example.paciente_service.domain.repository;

import com.example.paciente_service.domain.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, UUID> {
}
