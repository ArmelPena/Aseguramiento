package com.solverweb.aseguramiento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.solverweb.aseguramiento.entities.Ente_Terr;
import com.solverweb.aseguramiento.repository.Ente_TerrRepository;

@Service
public class Ente_TerrServiceImpl implements iEnte_TerrService{
	
	@Autowired
	private Ente_TerrRepository repoEnte_Terr;
	
	@Override
	public Ente_Terr Crear(Ente_Terr objEnteTerr) {
		return this.repoEnte_Terr.save(objEnteTerr);
	}
	
	@Override
	public List<Ente_Terr> Listar(){
		return (List<Ente_Terr>) repoEnte_Terr.findAll();
	}

	@Override
	public Ente_Terr Actualizar(Ente_Terr objEnteTerr) {
		// TODO Auto-generated method stub
		Integer nIdEnteTerr = objEnteTerr.getId();
		Optional<Ente_Terr> objOptional = this.repoEnte_Terr.findById(nIdEnteTerr);
		if(objOptional.isPresent()) {
			Ente_Terr objEnte_Terr = objOptional.get();
			objEnte_Terr.setCodigoDaneDpto(objEnteTerr.getCodigoDaneDpto());
			objEnte_Terr.setCodigoDaneMun(objEnteTerr.getCodigoDaneMun());
			objEnte_Terr.setDireccion(objEnteTerr.getDireccion());
			objEnte_Terr.setEMail(objEnteTerr.getEMail());
			objEnte_Terr.setNit(objEnteTerr.getNit());
			objEnte_Terr.setPaginaWeb(objEnteTerr.getPaginaWeb());
			objEnte_Terr.setRazonSocial(objEnteTerr.getRazonSocial());
			objEnte_Terr.setTelefono(objEnteTerr.getTelefono());
			return Crear(objEnte_Terr);
		}
		return null;
	}
}
