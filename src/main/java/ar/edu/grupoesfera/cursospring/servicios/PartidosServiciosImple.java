package ar.edu.grupoesfera.cursospring.servicios;

import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import ar.edu.grupoesfera.cursospring.dao.PartidoDao;
import ar.edu.grupoesfera.cursospring.modelo.Cancha;
import ar.edu.grupoesfera.cursospring.modelo.Partido;

@Service
public class PartidosServiciosImple implements PartidosServicios {

	@Inject
	private PartidoDao partidoDao;
	
	public void insertarPartido(Partido partido){
	
		partidoDao.insertarPartido(partido);
	}
	public List<Partido> listarPartidos(){
		
		List<Partido>partidosDelDia=partidoDao.getPartidos();
		
			return partidosDelDia;
		
	}
	
	public List<Partido>listarPartidosPorId(Long idUsuario){
	
	List<Partido>misPartidos=partidoDao.getPartidoPorId(idUsuario);
	return misPartidos;
	}

}
