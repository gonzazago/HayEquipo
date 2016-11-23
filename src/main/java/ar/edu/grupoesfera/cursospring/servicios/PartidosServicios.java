package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.ModelMap;

import ar.edu.grupoesfera.cursospring.modelo.Partido;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;

public interface PartidosServicios {

	public void insertarPartido(Partido partido, Long idUsuario);
	public void insertarJugador(Long idPartido, Long idUsuario);
    public List<Partido>listarPartidos();
    public List<Partido>partidoHistorial();

}
