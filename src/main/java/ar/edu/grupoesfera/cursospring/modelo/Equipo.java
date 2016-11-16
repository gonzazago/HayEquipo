package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Equipo {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEquipo;
	private String nombreEquipo;
	private String barrio;
	
	public Long getIdEquipo() {
		return idEquipo;
	}
	public void setIdEquipo(Long idEquipo) {
		this.idEquipo = idEquipo;
	}
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	public String getBarrio() {
		return barrio;
	}
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

}
