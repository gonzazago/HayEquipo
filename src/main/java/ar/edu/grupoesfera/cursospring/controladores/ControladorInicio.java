package ar.edu.grupoesfera.cursospring.controladores;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.clases.Loggin;
import ar.edu.grupoesfera.cursospring.clases.Usuario;

@Controller
public class ControladorInicio {
		
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView modelarVista( ModelMap model) {
		return new ModelAndView("vistas", model);
	}
	
	@RequestMapping(value = "/registrarse", method = { RequestMethod.GET })
	public ModelAndView registroUsuario(ModelMap model) {
				return new ModelAndView("registrarse",model);
	}/*
	
	@RequestMapping(value = "/iniciarSesion", method = { RequestMethod.GET })
	public ModelAndView iniciarSesion(ModelMap model) {
				return new ModelAndView("loggin","command",new Loggin());
	}*/

}
