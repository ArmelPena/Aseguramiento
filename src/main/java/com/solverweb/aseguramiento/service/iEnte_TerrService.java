package com.solverweb.aseguramiento.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.solverweb.aseguramiento.entities.Ente_Terr;

@Service
public interface iEnte_TerrService {
	public Ente_Terr Crear(Ente_Terr objEnteTerr);
	public List<Ente_Terr> Listar();
	public Ente_Terr Actualizar(Ente_Terr objEnteTerr);
}