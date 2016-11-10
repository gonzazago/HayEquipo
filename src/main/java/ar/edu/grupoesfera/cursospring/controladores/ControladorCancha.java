package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Cancha;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;
import ar.edu.grupoesfera.cursospring.servicios.CanchaServiciosImple;
import ar.edu.grupoesfera.cursospring.servicios.RegistrarUsuario;

@Controller
public class ControladorCancha {
	@Inject
	private CanchaServiciosImple registrarCancha;
	@RequestMapping(value = "/cancha", method = { RequestMethod.POST })
	public ModelAndView crearUsuario(@ModelAttribute Cancha cancha,ModelMap model, HttpServletRequest req) {
		
		registrarCancha.registrarCancha(cancha, model, req);
		return new ModelAndView("bienvenido", model);
	}
}
