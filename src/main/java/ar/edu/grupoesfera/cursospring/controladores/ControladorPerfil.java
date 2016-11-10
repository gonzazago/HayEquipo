package ar.edu.grupoesfera.cursospring.controladores;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Cancha;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;


@Controller
public class ControladorPerfil {

	@RequestMapping(value = "/registrarCancha", method = { RequestMethod.GET })
	public ModelAndView iniciarSesion(ModelMap model) {
				return new ModelAndView("registrarCancha","command",new Cancha());
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
