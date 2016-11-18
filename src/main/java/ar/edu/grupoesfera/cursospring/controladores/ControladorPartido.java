package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Partido;
import ar.edu.grupoesfera.cursospring.servicios.PartidosServicios;

@Controller
public class ControladorPartido {
	@Inject 
	private PartidosServicios partidoServicios;
	
	@RequestMapping(value = "/partido", method = { RequestMethod.POST })
	public ModelAndView partidoCreado(@ModelAttribute Partido partido, HttpServletRequest req) {
		ModelMap  model = new ModelMap();
		partido.setEstado("Pendiente");
		partidoServicios.insertarPartido(partido);
		return new ModelAndView("perfil", model);
	}

}
