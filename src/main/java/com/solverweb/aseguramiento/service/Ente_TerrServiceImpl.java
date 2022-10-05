package com.solverweb.aseguramiento.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.solverweb.aseguramiento.entities.Ente_Terr;
import com.solverweb.aseguramiento.repository.Ente_TerrRepository;

@Service
public class Ente_TerrServiceImpl implements iEnte_TerrService{
	
	//Inyección del repositorio
	@Autowired
	private Ente_TerrRepository ente_terrRepository;
	
	 /*
	@Override
	public List<Ente_Terr> Listar() {
		// TODO Auto-generated method stub
		return (List<Ente_Terr>) repoEnte_Terr.findAll();
	}
	*/
	@Override
	public List<Ente_Terr> ListarAll() {
		// TODO Auto-generated method stub
		List<Ente_Terr> listEnteTerr = new ArrayList<Ente_Terr>();
		ente_terrRepository.findAll().forEach(listEnteTerr::add);

		return listEnteTerr;
	}

	@Override
	public Optional ListarEnte_Terr(Integer id) {
		// TODO Auto-generated method stub
		Optional<Ente_Terr> ente_terr = ente_terrRepository.findById(id);		
		return ente_terr;
	}
}
