package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Cancha;

public interface CanchaDao {
	public void insertarCancha(Cancha cancha);

	public List<Cancha> getCanchas();

}
