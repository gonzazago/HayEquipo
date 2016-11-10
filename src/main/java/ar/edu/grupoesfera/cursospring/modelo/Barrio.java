package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Barrio {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String barrio;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBarrio() {
		return barrio;
	}
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

}
