package ar.edu.grupoesfera.cursospring.servicios;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.grupoesfera.cursospring.modelo.Cancha;
import ar.edu.grupoesfera.cursospring.modelo.Partido;

@Service
public class PartidosServiciosImple implements PartidosServicios {
	
	public List<Partido> listarPartidos(){
		List<Partido>partidos=new LinkedList<Partido>();
		Partido partido1 = new Partido();
		Partido partido2 = new Partido();
		
		
		partido1.setCancha("soccer");
		partido1.setNombreEquipo1("Los Pibes");
		partido1.setNombreEquipo2("Paso a Paso");
		partido1.setEstado("Terminado");
		partido1.setFechaPartido("8/11/2016");
		partido1.setHorarioPartido("20:00");
		partido1.setResultado("2 - 1 ");
		
		partido2.setCancha("soccer");
		partido2.setNombreEquipo1("tirando Magia");
		partido2.setNombreEquipo2("La banda");
		partido2.setEstado("Terminado");
		partido2.setFechaPartido("8/11/2016");
		partido2.setHorarioPartido("20:00");
		partido2.setResultado("3-1 ");
		
		partidos.add(partido1);
		partidos.add(partido2);
		return partidos;
		
	}

}
