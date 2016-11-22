package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.dao.UsuarioDao;
import ar.edu.grupoesfera.cursospring.modelo.Loggin;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;
import ar.edu.grupoesfera.cursospring.servicios.RegistrarUsuario;
import ar.edu.grupoesfera.cursospring.servicios.UsuarioLoggin;
import ar.edu.grupoesfera.cursospring.servicios.UsuarioServicios;

@Controller
public class ControladorLoggin {
	@Inject
	 private UsuarioLoggin logginUsuario;
	@Inject
	private UsuarioServicios usuarioServicios;
	
	
	@RequestMapping(value = "/inicioSesion", method = { RequestMethod.POST })
	public String validarUsuario(@ModelAttribute Loggin user, ModelMap model,HttpServletRequest req) {
		
		Usuario usuario = new Usuario();
		if(logginUsuario.verficarUsuario(user) == false)
			return "redirect:/iniciarSesion";
		
		else{
			usuario = usuarioServicios.buscarUsuario(user);
			req.getSession().setAttribute("idUsuario", usuario.getIdUsuario());
			req.getSession().setAttribute("usuario", usuario.getNomUsuario());
			return "redirect:/home";
		}
			
		  
	}
	

}
