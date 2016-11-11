package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.UsuarioParaPruebaTest;
import ar.edu.grupoesfera.cursospring.servicios.PersonaService;

public class PruebaLoginController
{
	@Inject
	public PersonaService personaService;
	
	public void setPersonaService(PersonaService personaService)
	{
		this.personaService = personaService;
		
	}
	
	@RequestMapping(path="/loginPrueba", method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute("usuario") UsuarioParaPruebaTest usuario, HttpServletRequest request)
	{
		
		UsuarioParaPruebaTest usuarioValidado = personaService.validarUsuario(usuario.getUsuario(), usuario.getPassword());
		if(usuarioValidado != null)
		{
			request.getSession().setAttribute("ROL",usuarioValidado.getRol());
			return new ModelAndView("home");
		} 
		else 
		{
			ModelMap model = new ModelMap();
			model.put("error", "usuaio-invalido");
			return new ModelAndView("login", model);
		}
    }

	

}
