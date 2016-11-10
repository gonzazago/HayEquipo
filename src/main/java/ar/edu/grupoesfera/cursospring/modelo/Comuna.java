/* mappedBy = "comuna" Cuando la Relacion es bidireccional*/
/*orphanRemoval= true/false Remueve o no los elementos huerfanos*/					
/*FetchType.LAZY tardio busca en la base de datos y lo devuelve 
 * Lazy Si es una coleccion no lo trae la coleccion a menos que alguien la consulte
 * EALER Si es un objeto lo trae*/

package ar.edu.grupoesfera.cursospring.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Comuna {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	@OneToMany(orphanRemoval= true, fetch = FetchType.LAZY )														
	@Cascade(value = CascadeType.ALL)					
	private List<Barrio> barrios;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Barrio> getBarrios() {
		return barrios;
	}
	public void setBarrios(List<Barrio> barrios) {
		this.barrios = barrios;
	}

}
