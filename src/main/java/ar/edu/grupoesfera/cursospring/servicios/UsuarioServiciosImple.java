package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import ar.edu.grupoesfera.cursospring.dao.UsuarioDao;
import ar.edu.grupoesfera.cursospring.modelo.Loggin;
import ar.edu.grupoesfera.cursospring.modelo.Partido;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;

@Service
public class UsuarioServiciosImple implements UsuarioServicios{
	@Inject
	private UsuarioDao usuarioDao;
	public Usuario buscarUsuario(Loggin user){
		Usuario usuarioEncontrado = usuarioDao.recuperarUsuarioporNombreUsuario(user);
		return usuarioEncontrado;
	}
	
	public Usuario buscarUsuarioPorId(Long idUsuario){
		
		Usuario usuarioEncontrado = usuarioDao.recuperarUsuarioPorId(idUsuario);
		return usuarioEncontrado;
	}
	
	public List<Usuario> listarUsuarios(){
		
		List<Usuario> usuarios = usuarioDao.listarUsuarios();
		return usuarios;
	}

}
