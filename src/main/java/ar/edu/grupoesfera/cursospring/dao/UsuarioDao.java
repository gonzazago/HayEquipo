package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Loggin;
import ar.edu.grupoesfera.cursospring.modelo.Partido;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;

public interface UsuarioDao {

	public void cargarUsuario(Usuario user);
	public List<Usuario> recuperarUsuario(Loggin Usuario);
	public Usuario  recuperarUsuarioporNombreUsuario(Loggin user);
	public Usuario recuperarUsuarioPorId(Long idUsuario);
	public List<Partido> misPartidos(Long idUsuario);
	
	
	
}
