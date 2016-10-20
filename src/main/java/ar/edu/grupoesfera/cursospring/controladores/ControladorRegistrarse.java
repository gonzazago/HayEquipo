package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.clases.Usuario;
import ar.edu.grupoesfera.cursospring.servicios.RegistrarUsuario;

@Controller
public class ControladorRegistrarse {
	
	@Inject
	private RegistrarUsuario registrarUsuario;
	
	@RequestMapping(value = "/registrarse", method = { RequestMethod.POST })
	public ModelAndView crearUsuario(@ModelAttribute Usuario user,
			ModelMap model) {
		
		registrarUsuario.crearUsuario(user, model);

		return new ModelAndView("bienvenido", model);
	}

}
