package com.solverweb.aseguramiento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.solverweb.aseguramiento.entities.Ente_Terr;

@Service
public interface iEnte_TerrService {
	public List<Ente_Terr> ListarAll();
	public Optional ListarEnte_Terr(Integer Id);
}