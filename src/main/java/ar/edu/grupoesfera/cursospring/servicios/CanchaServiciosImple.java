package ar.edu.grupoesfera.cursospring.servicios;

import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import ar.edu.grupoesfera.cursospring.dao.CanchaDao;
import ar.edu.grupoesfera.cursospring.dao.UsuarioDao;
import ar.edu.grupoesfera.cursospring.modelo.Cancha;

@Service
public class CanchaServiciosImple implements CanchasServicios {

	@Inject
	private CanchaDao canchaDao;	
	public void registrarCancha(Cancha cancha){
		canchaDao.insertarCancha(cancha);
	}
	
	public List<Cancha>listarCanchas(){
	
		List<Cancha>canchas=canchaDao.getCanchas();
	
		return canchas;
	}
	
	public List<Cancha>buscarCanchas(String localidad){
		
		List<Cancha>canchas=canchaDao.getCanchasPorLocalidad(localidad);
	
		return canchas;
	}
	

}
