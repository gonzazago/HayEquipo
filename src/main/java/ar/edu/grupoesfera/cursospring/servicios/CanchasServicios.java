package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.ModelMap;

import ar.edu.grupoesfera.cursospring.modelo.Cancha;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;

public interface CanchasServicios {
	
	public void registrarCancha(Cancha cancha, ModelMap model, HttpServletRequest req);
	public List<Cancha> listarCanchas();

}
