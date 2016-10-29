package ar.edu.grupoesfera.cursospring.servicios;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.ModelMap;

import ar.edu.grupoesfera.cursospring.modelo.Loggin;

public interface UsuarioLoggin {

	public boolean verficarUsuario(Loggin user, HttpServletRequest req,ModelMap model);
	
}
