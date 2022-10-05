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
	@Column(name="codigodanedpto")
	private String CodigoDaneDpto;
	
	@NonNull
	@Column(name="codigodanemun")
	private String CodigoDaneMun;
	
	@Column(name="nit")
	private String Nit;
	
	@NonNull
	@Column(name="razonsocial")
	private String RazonSocial;
	
	@Column(name="direccion")
	private String Direccion;
	
	@Column(name="telefono")
	private String Telefono;
	
	@Column(name="paginaweb")
	private String PaginaWeb;
	
	@Column(name="email")
	private String EMail;	
}
