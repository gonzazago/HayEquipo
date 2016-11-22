package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;
import ar.edu.grupoesfera.cursospring.servicios.RegistrarUsuario;

@Controller
public class ControladorRegistrarse {
	
	@Inject
	private RegistrarUsuario registrarUsuario;
	
	@RequestMapping(value = "/registro", method = { RequestMethod.POST })
	public String crearUsuario(@ModelAttribute Usuario user,HttpServletRequest req) {
		ModelMap  model = new ModelMap();
		registrarUsuario.crearUsuario(user);
		req.getSession().setAttribute("idUsuario",user.getIdUsuario());
		req.getSession().setAttribute("usuario",user.getNomUsuario());

		return "redirect:/home";
	}

}
