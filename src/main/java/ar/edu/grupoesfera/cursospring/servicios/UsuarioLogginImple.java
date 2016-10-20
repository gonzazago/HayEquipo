package ar.edu.grupoesfera.cursospring.servicios;

import org.springframework.stereotype.Service;

import ar.edu.grupoesfera.cursospring.clases.Loggin;

@Service
public class UsuarioLogginImple implements UsuarioLoggin {
	
	public boolean verficarUsuario(Loggin user){
		return true;
	}
}
