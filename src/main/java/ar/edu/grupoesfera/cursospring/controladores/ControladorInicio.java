package ar.edu.grupoesfera.cursospring.controladores;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.clases.Usuario;
import ar.edu.grupoesfera.cursospring.clases.loggin;

@Controller
public class ControladorInicio {
		
@RequestMapping(value ="/home", method=RequestMethod.GET)
public ModelAndView modelarVista(){
	return new ModelAndView ("vistas","command",new Usuario());
		}


@RequestMapping(value="/bienvenido", method = {RequestMethod.POST})
public ModelAndView crearUsuario (@ModelAttribute Usuario user, ModelMap model){
	model.addAttribute("nombre",user.getNombre());
	model.addAttribute("apellido",user.getApellido());
	model.addAttribute("nomUsuario",user.getNomUsuario());
	model.addAttribute("password",user.getPassword());
	model.addAttribute("password2",user.getPassword2());
	model.addAttribute("mail",user.getMail());
	
return new ModelAndView("bienvenido",model);
}




}

