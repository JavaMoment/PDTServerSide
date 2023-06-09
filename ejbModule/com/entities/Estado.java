package com.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ESTADOS database table.
 * 
 */
@Entity
@Table(name="ESTADOS")
@NamedQuery(name="Estado.findAll", query="SELECT e FROM Estado e")
public class Estado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="EVENTOS_IDESTADO_GENERATOR", sequenceName="SEQ_ESTADOS", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EVENTOS_IDESTADO_GENERATOR")	
	@Column(name="ID_ESTADO")
	private long idEstado;

	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="ACTIVO")
	private int activo;

	//bi-directional many-to-one association to Evento
	@OneToMany(mappedBy="estado")
	private List<Evento> eventos;

	public Estado() {
	}

	public long getIdEstado() {
		return this.idEstado;
	}

	public void setIdEstado(long idEstado) {
		this.idEstado = idEstado;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Evento> getEventos() {
		return this.eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return nombre;
	}

	

}