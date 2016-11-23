package ar.edu.grupoesfera.cursospring.servicios;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import ar.edu.grupoesfera.cursospring.dao.PartidoDao;
import ar.edu.grupoesfera.cursospring.dao.UsuarioDao;
import ar.edu.grupoesfera.cursospring.modelo.Cancha;
import ar.edu.grupoesfera.cursospring.modelo.Partido;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;

@Service
public class PartidosServiciosImple implements PartidosServicios {

	@Inject
	private PartidoDao partidoDao;
	@Inject
	private UsuarioServicios usuariosServicios;
	@Inject
	private UsuarioDao usuarioDao;
	
	public void insertarPartido(Partido partido, Long idUsuario){
	
		Usuario user = usuariosServicios.buscarUsuarioPorId(idUsuario);
		partido.getJugadores().add(user);
		user.getPartidos().add(partido);
		partidoDao.insertarPartido(partido);
	}
	public List<Partido> listarPartidos(){
		
		List<Partido>partidosDelDia=partidoDao.getPartidos();
		
			return partidosDelDia;
		
	}
	
	public void insertarJugador(Long idPartido, Long idUsuario){
	
	Partido partido = partidoDao.getPartidosPorId(idPartido);
	Usuario user = usuariosServicios.buscarUsuarioPorId(idUsuario);
	user.getPartidos().add(partido);
	partido.getJugadores().add(user);
    partidoDao.insertarJugador(partido);
		
		
	}
	@Override
	public List<Partido> partidoHistorial() {
		Date fecha = new Date();
		SimpleDateFormat dmaFormat = new SimpleDateFormat("dd/yy/yyyy");
		String Fecha = dmaFormat.format(fecha);
		List<Partido> lista = partidoDao.partidosHistorial(Fecha);
		return lista;
	}

}
