package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cancha {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCancha;
	private String nombre;
	private String provincia;
	private String localidad;
	private String calle;
	private Integer numero;
	private Integer canchasDisponibles;
	
	public Long getIdCancha() {
		return idCancha;
	}
	public void setIdCancha(Long idCancha) {
		this.idCancha = idCancha;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getCanchasDisponibles() {
		return canchasDisponibles;
	}
	public void setCanchasDisponibles(Integer canchasDisponibles) {
		this.canchasDisponibles = canchasDisponibles;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

}
