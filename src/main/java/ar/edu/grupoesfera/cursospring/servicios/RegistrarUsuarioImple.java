package ar.edu.grupoesfera.cursospring.servicios;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import ar.edu.grupoesfera.cursospring.dao.UsuarioDao;
import ar.edu.grupoesfera.cursospring.dao.UsuarioImpl;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;

@Service
public class RegistrarUsuarioImple implements RegistrarUsuario {
	@Inject
	private UsuarioDao usuario; 
	public void crearUsuario(Usuario user){
		usuario.cargarUsuario(user);
				
	}

}
