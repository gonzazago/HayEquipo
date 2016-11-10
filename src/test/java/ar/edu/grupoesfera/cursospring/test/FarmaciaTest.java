package ar.edu.grupoesfera.cursospring.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Session;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.modelo.Barrio;
import ar.edu.grupoesfera.cursospring.modelo.Comuna;
import ar.edu.grupoesfera.cursospring.modelo.Farmacia;

public class FarmaciaTest  extends SpringTest{
	/*@Test
	@Transactional @Rollback
	public void insertarFarmaciaSinBarrio(){
		
		Farmacia miFarmacia = new Farmacia();
		Direccion miDireccion = new Direccion();
		miDireccion.setCalle("Florencio Varela");
		miDireccion.setPuerta("Puerta 1");
		
		miFarmacia.setDireccion(miDireccion);
		miFarmacia.setNombre("FarmaciaPrueba");
		Session s=getSession();
		s.save(miFarmacia);
		assertThat(s.get(Farmacia.class, miFarmacia.getId())).isNotNull();
	}
	
	
	@Test
	@Transactional @Rollback
	public void insertarFarmaciaConBarrio(){
		
		Session s=getSession();
		Farmacia miFarmacia = new Farmacia();
		Direccion miDireccion = new Direccion();
		Barrio miBarrio = new Barrio();
		miDireccion.setCalle("Florencio Varela");
		miDireccion.setPuerta("Puerta 1");
		miBarrio.setBarrio("Moron");
		s.save(miBarrio);
		miDireccion.setBario(miBarrio);
		miFarmacia.setDireccion(miDireccion);
		miFarmacia.setNombre("FarmaciaPrueba");
		
		s.save(miFarmacia);
		assertThat(s.get(Farmacia.class, miFarmacia.getId())).isNotNull();
	}*/
	
	@Test
	@Transactional @Rollback
	public void recuperarBarrios(){
		
		Session s=getSession();
		
		Comuna miComuna = new Comuna();
		Barrio miBarrio = new Barrio();
		List<Barrio> barrios =new LinkedList<Barrio>(); 
		miBarrio.setBarrio("moron");
		barrios.add(miBarrio);
		barrios.add(new Barrio());
		barrios.add(new Barrio());
		barrios.add(new Barrio());
		miComuna.setBarrios(barrios);
		s.save(miComuna);
	}
}
