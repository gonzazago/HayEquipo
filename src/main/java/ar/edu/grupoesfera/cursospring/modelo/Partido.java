package ar.edu.grupoesfera.cursospring.modelo;

public class Partido {

	private Long idPartido;
	private String cancha;
	private String nombreEquipo1;
	private String nombreEquipo2;
	private Integer cantJugadores;
	private String fechaPartido;
	private String horarioPartido;
	public Long getIdPartido() {
		return idPartido;
	}
	public void setIdPartido(Long idPartido) {
		this.idPartido = idPartido;
	}
	public String getCancha() {
		return cancha;
	}
	public void setCancha(String cancha) {
		this.cancha = cancha;
	}
	public String getNombreEquipo1() {
		return nombreEquipo1;
	}
	public void setNombreEquipo1(String nombreEquipo1) {
		this.nombreEquipo1 = nombreEquipo1;
	}
	public String getNombreEquipo2() {
		return nombreEquipo2;
	}
	public void setNombreEquipo2(String nombreEquipo2) {
		this.nombreEquipo2 = nombreEquipo2;
	}
	public Integer getCantJugadores() {
		return cantJugadores;
	}
	public void setCantJugadores(Integer cantJugadores) {
		this.cantJugadores = cantJugadores;
	}
	public String getFechaPartido() {
		return fechaPartido;
	}
	public void setFechaPartido(String fechaPartido) {
		this.fechaPartido = fechaPartido;
	}
	public String getHorarioPartido() {
		return horarioPartido;
	}
	public void setHorarioPartido(String horarioPartido) {
		this.horarioPartido = horarioPartido;
	}
	
}
