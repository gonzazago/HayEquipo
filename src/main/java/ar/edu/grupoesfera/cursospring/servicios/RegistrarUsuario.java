package ar.edu.grupoesfera.cursospring.servicios;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.ModelMap;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;

public interface RegistrarUsuario {
	public void crearUsuario(Usuario user);

}
