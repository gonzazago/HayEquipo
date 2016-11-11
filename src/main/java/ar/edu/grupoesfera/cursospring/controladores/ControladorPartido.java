package ar.edu.grupoesfera.cursospring.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Partido;

@Controller
public class ControladorPartido {

	private List<Partido> partidosCreados = new ArrayList<Partido>();
	
	@RequestMapping(value = "/partidoCreado", method = { RequestMethod.POST })
	public ModelAndView partidoCreado(@ModelAttribute Partido partido,ModelMap model, HttpServletRequest req) {
		/*registrarUsuario.crearUsuario(user, model,req);
		req.getSession().setAttribute("usuario",user.getNombre());*/
		

		return new ModelAndView("vistas", model);
	}
	
}
