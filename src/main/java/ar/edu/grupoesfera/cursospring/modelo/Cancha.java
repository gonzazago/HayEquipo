package ar.edu.grupoesfera.cursospring.modelo;

public class Cancha {
	
	private Long idCancha;
	private String nombre;
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

}