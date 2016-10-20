package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.clases.Loggin;
import ar.edu.grupoesfera.cursospring.clases.Usuario;
import ar.edu.grupoesfera.cursospring.servicios.RegistrarUsuario;
import ar.edu.grupoesfera.cursospring.servicios.UsuarioLoggin;

@Controller
public class ControladorLoggin {
	@Inject
	private UsuarioLoggin logginUsuario;
	
	@RequestMapping(value = "/inicioSesion", method = { RequestMethod.POST })
	public ModelAndView validarUsuario(@ModelAttribute Loggin user, ModelMap model) {
		return new ModelAndView("bienvenido", model);
		/*if(logginUsuario.verficarUsuario(user) == true)
			return new ModelAndView("bienvenido", model);
		else
			return new ModelAndView("loggin", "command", new Loggin());*/
		  

		
	}

}
