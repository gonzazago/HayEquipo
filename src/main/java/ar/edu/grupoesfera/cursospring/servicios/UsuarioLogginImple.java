package ar.edu.grupoesfera.cursospring.servicios;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import ar.edu.grupoesfera.cursospring.dao.UsuarioDao;
import ar.edu.grupoesfera.cursospring.modelo.Loggin;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;

@Service
public class UsuarioLogginImple implements UsuarioLoggin {
	
	@Inject
	private UsuarioDao usuarioServicios;
	
	public boolean verficarUsuario(Loggin user){
		Usuario usuario;
		if(user.getUsuario().isEmpty() || user.getPassword().isEmpty())
			return false;
		else
			if(usuarioServicios.recuperarUsuario(user).isEmpty())
				return false;
			else
				 return true;
			
				
				
				
					
		
	}
}

