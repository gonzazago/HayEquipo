package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.clases.Usuario;
import ar.edu.grupoesfera.cursospring.clases.loggin;
import ar.edu.grupoesfera.cursospring.servicios.RegistrarUsuario;

@Controller
public class ControladorInicio {
	@Inject
	private RegistrarUsuario registrarUsuario;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView modelarVista( HttpServletRequest request) {
		request.getSession();//.setAttribute(arg0, arg1);
		return new ModelAndView("vistas", "command", new Usuario());
	}

	@RequestMapping(value = "/bienvenido", method = { RequestMethod.POST })
	public ModelAndView crearUsuario(@ModelAttribute Usuario user,
			ModelMap model) {
		registrarUsuario.crearUsuario(user, model);

		return new ModelAndView("bienvenido", model);
	}

}
