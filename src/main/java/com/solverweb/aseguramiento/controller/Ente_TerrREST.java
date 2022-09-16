package com.solverweb.aseguramiento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.solverweb.aseguramiento.entities.Ente_Terr;
import com.solverweb.aseguramiento.service.iEnte_TerrService;

@RestController
public class Ente_TerrREST {
	
	// Inyección de la clase del servicio
	@Autowired
	private iEnte_TerrService Ente_TerrService;
	
    /*
    * Este método se hará cuando por una petición POST (como indica la anotación) se llame a la url
    * http://127.0.0.1:8080/api/beneficiarios/  
    *
    */	
	@PostMapping("/EnteTerritorial")
	public Ente_Terr newEnte_Territorial(@RequestBody Ente_Terr objEnte_Terr) {
		objEnte_Terr.setId(0);
		Ente_TerrService.Crear(objEnte_Terr);
		return objEnte_Terr;
	}
	
	/*
	 * Este método se hará cuando por una petición GET (como indica la anotación) se
	 * llame a la url http://127.0.0.1:8080/api/users
	 */
	@GetMapping("/EnteTerritorial")
	public List<Ente_Terr> findAll() {
		// retornará toda la base de datos
		return Ente_TerrService.Listar();
	}
	
}
