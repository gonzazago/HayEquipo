package ar.edu.grupoesfera.cursospring.servicios;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import ar.edu.grupoesfera.cursospring.dao.InsertarUsuario;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;

@Service
public class registrarUsuarioImple implements RegistrarUsuario {
	
	public void crearUsuario(Usuario user, ModelMap model, HttpServletRequest req){

		InsertarUsuario usuario =  new InsertarUsuario();
		usuario.cargarUsuario(user);
		
		
		model.addAttribute("nombre",user.getNombre());
		model.addAttribute("apellido",user.getApellido());
		model.addAttribute("nomUsuario",user.getNomUsuario());
		model.addAttribute("password",user.getPassword());
		model.addAttribute("password2",user.getPassword2());
		model.addAttribute("mail",user.getMail());

		
	}

}
