package ar.edu.grupoesfera.cursospring.controladores;


import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.clases.Loggin;
import ar.edu.grupoesfera.cursospring.clases.Usuario;
import ar.edu.grupoesfera.cursospring.servicios.UsuarioLoggin;
import ar.edu.grupoesfera.cursospring.servicios.VerificarUsuario;

@Controller
public class ControladorInicio {
	@Inject
	private VerificarUsuario usuario;
		
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView modelarVista( ModelMap model,HttpServletRequest req) {
		return new ModelAndView("vistas", model);
	}
	
	@RequestMapping(value = "/registrarse", method = { RequestMethod.GET })
	public ModelAndView registroUsuario(ModelMap model) {
				return new ModelAndView("registrarse","command",new Usuario());
	}
	
	@RequestMapping(value = "/iniciarSesion", method = { RequestMethod.GET })
	public ModelAndView iniciarSesion(ModelMap model) {
				return new ModelAndView("loggin","command",new Loggin());
	}
	
	@RequestMapping(value = "/logout", method = { RequestMethod.GET })
	public ModelAndView cerrarSesion(HttpServletRequest session, ModelMap model) {
				session.getSession().invalidate();
				return new ModelAndView("vistas",model);
	}
	
	@RequestMapping(value="/unirse", method = {RequestMethod.GET})
	public ModelAndView unirsePartido (ModelMap model, HttpServletRequest req, Loggin user){
		Boolean resp = usuario.verificarUsuarioLogeado(user,req);
		if(resp == false)
			return new ModelAndView("loggin","command",new Loggin());
		else
			return new ModelAndView("vistas", model);
		
	}

}
