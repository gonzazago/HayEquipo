package ar.edu.grupoesfera.cursospring.servicios;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import ar.edu.grupoesfera.cursospring.dao.UsuarioDao;
import ar.edu.grupoesfera.cursospring.modelo.Loggin;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;

@Service
public class UsuarioServiciosImple implements UsuarioServicios{
	@Inject
	private UsuarioDao usuarioDao;
	public Usuario buscarUsuario(Loggin user){
		Usuario usuarioEncontrado = usuarioDao.recuperarUsuarioporNombreUsuario(user);
		return usuarioEncontrado;
	}
	

}
