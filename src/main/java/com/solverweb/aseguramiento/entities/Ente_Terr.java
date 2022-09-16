package com.solverweb.aseguramiento.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

@Entity
@Data
@Table(name="ente_terr")
@ToString
@NoArgsConstructor
public class Ente_Terr {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idente_terr")
    private Integer Id;
	
	@NonNull
	@Column(name="CodigoDaneDpto")
	private String CodigoDaneDpto;
	
	@NonNull
	@Column(name="CodigoDaneMun")
	private String CodigoDaneMun;
	
	@Column(name="Nit")
	private String Nit;
	
	@NonNull
	@Column(name="RazonSocial")
	private String RazonSocial;
	
	@Column(name="Direccion")
	private String Direccion;
	
	@Column(name="Telefono")
	private String Telefono;
	
	@Column(name="PaginaWeb")
	private String PaginaWeb;
	
	@Column(name="EMail")
	private String EMail;	
}
