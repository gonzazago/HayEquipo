package ar.edu.grupoesfera.cursospring.servicios;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.ModelMap;

import ar.edu.grupoesfera.cursospring.modelo.Loggin;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;

public interface UsuarioServicios {
	public Usuario buscarUsuario(Loggin user);

}
