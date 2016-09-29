package ar.edu.grupoesfera.cursospring.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.clases.Persona;

@Controller
public class controladorPorPost {
	@RequestMapping(value = "/formulario", method=RequestMethod.GET)
    public ModelAndView verFormulario() {
        return new ModelAndView ("FormPost","command",new Persona());
    }
	
	@RequestMapping(value="/saludo", method = {RequestMethod.POST})
	public ModelAndView crearPersona (@ModelAttribute Persona persona){
			
		return new ModelAndView("saludo");
	}

}
