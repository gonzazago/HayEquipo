package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Direccion {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String calle;
	private String puerta;
	/* Relacion 1 - N */
	@ManyToOne @JoinColumn(name = "id_barrio", nullable = false)
	private Barrio bario;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getPuerta() {
		return puerta;
	}
	public void setPuerta(String puerta) {
		this.puerta = puerta;
	}
	public Barrio getBario() {
		return bario;
	}
	public void setBario(Barrio bario) {
		this.bario = bario;
	}
}
