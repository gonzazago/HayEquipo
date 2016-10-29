package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Loggin;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;
import ar.edu.grupoesfera.cursospring.servicios.RegistrarUsuario;
import ar.edu.grupoesfera.cursospring.servicios.UsuarioLoggin;

@Controller
public class ControladorLoggin {
	@Inject
	private UsuarioLoggin logginUsuario;
	
	@RequestMapping(value = "/inicioSesion", method = { RequestMethod.POST })
	public ModelAndView validarUsuario(@ModelAttribute Loggin user, ModelMap model,HttpServletRequest req) {
		
		if(logginUsuario.verficarUsuario(user,req,model) == true){
			req.getSession().setAttribute("usuario",user.getUsuario());
			return new ModelAndView("vistas", model);
		}
		else
			return new ModelAndView("loggin", "command", new Loggin());
		  
	}
	

}
