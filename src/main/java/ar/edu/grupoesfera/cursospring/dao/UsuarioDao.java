package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Loggin;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;

public interface UsuarioDao {

	public void cargarUsuario(Usuario user);
	public List<Usuario> recuperarUsuario(Loggin Usuario);
	public Usuario  recuperarUsuarioporNombreUsuario(Loggin user);
	
	
}
