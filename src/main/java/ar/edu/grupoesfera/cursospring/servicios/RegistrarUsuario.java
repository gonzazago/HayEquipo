package ar.edu.grupoesfera.cursospring.servicios;

import org.springframework.ui.ModelMap;

import ar.edu.grupoesfera.cursospring.clases.Usuario;

public interface RegistrarUsuario {
	public void crearUsuario(Usuario user, ModelMap model);

}
