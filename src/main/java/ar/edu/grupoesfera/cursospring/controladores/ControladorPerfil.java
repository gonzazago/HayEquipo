package ar.edu.grupoesfera.cursospring.controladores;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Cancha;
import ar.edu.grupoesfera.cursospring.modelo.Partido;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;
import ar.edu.grupoesfera.cursospring.servicios.CanchasServicios;
import ar.edu.grupoesfera.cursospring.servicios.PartidosServicios;


@Controller
public class ControladorPerfil {
	
	@Inject 
	private PartidosServicios partidoServicios;
	
	@Inject
	private CanchasServicios canchas;
	

	@RequestMapping(value = "/registrarCancha", method = { RequestMethod.GET })
	public ModelAndView registrarCancha(ModelMap model) {
				return new ModelAndView("registrarCancha","command",new Cancha());
	}
	
	@RequestMapping(value = "/crearPartido", method = { RequestMethod.GET })
	public ModelAndView registrarPartido(ModelMap model, HttpServletRequest req) {
		Partido nuevoPartido = new Partido();
		Long idUsuario=(Long) req.getAttribute("idUsuario");
		List<Cancha>listadoCanchas = canchas.listarCanchas();
		model.put("idUsuario", idUsuario);
		model.put("listadoCanchas",listadoCanchas);
		model.put("partido", nuevoPartido);
		return new ModelAndView("crearPartido","command",nuevoPartido);
	}
		
	
	@RequestMapping(value = "/modificarDatos", method = { RequestMethod.POST })
	public ModelAndView modificarDatos(@ModelAttribute Usuario user,HttpServletRequest req) {
		
		Map<String, Object> miModelo = new HashMap<String, Object>();
		
		miModelo.put("nombre", user.getNombre());
		miModelo.put("apellido", user.getApellido());
		miModelo.put("nomUsuario", user.getNomUsuario());
		miModelo.put("password", user.getPassword());
		miModelo.put("password2", user.getPassword2());
		miModelo.put("mail", user.getMail());
		ModelAndView model= new ModelAndView();
		model.setViewName("modificarDatos");
		model.addObject(miModelo);
		return model;
		
	}
}
