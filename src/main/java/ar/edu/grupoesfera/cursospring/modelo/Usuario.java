package ar.edu.grupoesfera.cursospring.modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Usuario {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idUsuario;
	private String nombre;
	private String apellido;
	private String nomUsuario;
	private String password;
	private String password2;
	private String mail;
	
	@ManyToMany( fetch = FetchType.EAGER, mappedBy="jugadores")
	private Set<Partido> partidos = new HashSet<Partido>();
	
	@ManyToOne @JoinColumn(name = "id_eqipo")
	@Cascade(value = CascadeType.ALL)
	private Equipo equipo;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNomUsuario() {
		return nomUsuario;
	}
	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Equipo getEquipo() {
		return equipo;
	}
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	public Set<Partido> getPartidos() {
		return partidos;
	}
	public void setPartidos(Set<Partido> partidos) {
		this.partidos = partidos;
	}
	

}
