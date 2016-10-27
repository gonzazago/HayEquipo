package ar.edu.grupoesfera.cursospring.servicios;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import ar.edu.grupoesfera.cursospring.clases.Loggin;

@Service
public class UsuarioLogginImple implements UsuarioLoggin {
	
	public boolean verficarUsuario(Loggin user, HttpServletRequest req, ModelMap model){
		
		HttpSession missesion = req.getSession(true);
		String nombreUsuario = req.getParameter("usuario");
		if(user.getUsuario().isEmpty())
			return false;
		else
			if(user.getPassword().isEmpty())
				return false;
			else{
				 model.addAttribute("Usuario",user.getUsuario());
				 model.addAttribute("session",nombreUsuario);
				 return true;
			}
				
				
				
					
		
	}
}

