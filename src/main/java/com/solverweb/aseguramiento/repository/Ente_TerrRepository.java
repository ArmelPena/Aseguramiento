package com.solverweb.aseguramiento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.solverweb.aseguramiento.entities.Ente_Terr;

// Usa Spring Data JPA para rápido acceso a las operaciones CRUD

public interface Ente_TerrRepository extends JpaRepository<Ente_Terr, Integer>{
}
