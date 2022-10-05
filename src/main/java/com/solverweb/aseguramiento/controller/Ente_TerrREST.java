package com.solverweb.aseguramiento.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.solverweb.aseguramiento.entities.Ente_Terr;
import com.solverweb.aseguramiento.repository.Ente_TerrRepository;
import com.solverweb.aseguramiento.service.Ente_TerrServiceImpl;

@RestController
public class Ente_TerrREST {

	// Inyección de la clase del servicio
	@Autowired
	private Ente_TerrRepository ente_terrRepository;
	//private Ente_TerrServiceImpl ente_TerrServiceImpl;

	/*
	 * Este método se hará cuando por una petición POST (como indica la anotación)
	 * se llame a la url http://127.0.0.1:8080/api/beneficiarios/
	 *
	 * 
	 * @PostMapping("/ente_territorial/crear") public Ente_Terr
	 * newEnte_Territorial(@RequestBody Ente_Terr objEnte_Terr) {
	 * objEnte_Terr.setId(0); Ente_TerrService.Crear(objEnte_Terr); return
	 * objEnte_Terr; }
	 */

	/*
	 * Este método se hará cuando por una petición GET (como indica la anotación) se
	 * llame a la url http://127.0.0.1:8080/api/users
	 */
	@GetMapping("/entes")
	public ResponseEntity<List<Ente_Terr>> findAll() {
		try {
			//List<Ente_Terr> listEnteTerr = ente_TerrServiceImpl.ListarAll();
			
			List<Ente_Terr> listEnteTerr = new ArrayList<Ente_Terr>();
			ente_terrRepository.findAll().forEach(listEnteTerr::add);

			if (listEnteTerr.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(listEnteTerr, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	  @GetMapping("/entes/{id}")
	  public ResponseEntity<Ente_Terr> getEnte_TerrById(@PathVariable("id") Integer id) {
		  
		  //Optional<Ente_Terr> ente_terr = ente_TerrServiceImpl.ListarEnte_Terr(id);
		  
		  Optional<Ente_Terr> ente_terr = ente_terrRepository.findById(id);

	    if (ente_terr.isPresent()) {
	      return new ResponseEntity<>(ente_terr.get(), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }	
}
