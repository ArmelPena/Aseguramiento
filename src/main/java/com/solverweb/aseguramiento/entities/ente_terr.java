package com.solverweb.aseguramiento.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

@Entity
@Table(name="ente_terr")
@ToString
@NoArgsConstructor
public class ente_terr {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int IdEnte_Terr;
	@NonNull
	private String CodigoDaneDpto;
	@NonNull
	private String CodigoDaneMun;
	private String Nit;
	@NonNull
	private String RazonSocial;
	private String Direccion;
	private String Telefono;
	private String PaginaWeb;
	private String EMail;	
}
