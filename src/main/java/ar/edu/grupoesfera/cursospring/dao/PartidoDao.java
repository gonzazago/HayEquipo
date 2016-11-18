package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;


import ar.edu.grupoesfera.cursospring.modelo.Partido;

public interface PartidoDao {
	
	public void insertarPartido(Partido partido);
	public List<Partido> getPartidos();
	public List<Partido> getPartidoPorId(Long idUsuario);

}
