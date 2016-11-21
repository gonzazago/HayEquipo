package ar.edu.grupoesfera.cursospring.modelo;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Partido {

	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPartido;
	//@ManyToOne @JoinColumn(name = "id_cancha", nullable = false)
	private String cancha;
	private String nombreEquipo1;
	private String nombreEquipo2;
	private Integer cantJugadores;
	private String fechaPartido;
	private String horarioPartido;
	private String estado;
	private String resultado;
	private Long idUsuario;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@Cascade(value = CascadeType.ALL)
	@JoinTable(name = "jugadores_partido", joinColumns ={@JoinColumn(name="idPartido",referencedColumnName="idPartido")},
	inverseJoinColumns={@JoinColumn(name="idUsuario",referencedColumnName="idUsuario")})
	private List<Usuario> jugadores = new LinkedList<Usuario>();
	
	public Long getIdPartido() {
		return idPartido;
	}
	public void setIdPartido(Long idPartido) {
		this.idPartido = idPartido;
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public void setCancha(String cancha) {
		this.cancha = cancha;
	}
	public String getCancha() {
		return cancha;
	}
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public List<Usuario> getJugadores() {
		return jugadores;
	}
	public void setJugadores(List<Usuario> jugadores) {
		this.jugadores = jugadores;
	}
	
	
	
	
	
}
