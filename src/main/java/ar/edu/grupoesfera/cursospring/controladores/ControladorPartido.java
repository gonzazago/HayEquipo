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
import ar.edu.grupoesfera.cursospring.servicios.UsuarioServicios;

@Controller
public class ControladorPartido {
	@Inject 
	private PartidosServicios partidoServicios;
	
	@Inject
	private UsuarioServicios usuarioServicios;
	
	@RequestMapping(value = "/partido", method = { RequestMethod.POST })
	public String partidoCreado(@ModelAttribute Partido partido, HttpServletRequest req) {
		ModelMap  model = new ModelMap();
		partido.setEstado("Pendiente");
		Long idUsuario = (Long) req.getSession().getAttribute("idUsuario");
		partidoServicios.insertarPartido(partido,idUsuario);
		return "redirect:/perfil";
	}

}
