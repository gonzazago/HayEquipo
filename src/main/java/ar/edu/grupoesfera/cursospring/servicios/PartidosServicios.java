package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.ModelMap;

import ar.edu.grupoesfera.cursospring.modelo.Partido;

public interface PartidosServicios {

	public void insertarPartido(Partido partido);
    public List<Partido>listarPartidos();
    public List<Partido>listarPartidosPorId(Long idUsuario);

}
