package ar.edu.grupoesfera.cursospring.servicios;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import ar.edu.grupoesfera.cursospring.modelo.Cancha;

@Service
public class CanchaServiciosImple implements CanchasServicios {
	
	public void registrarCancha(Cancha cancha, ModelMap model, HttpServletRequest req){
		
		model.addAttribute("nombre", cancha.getNombre());
		model.addAttribute("provincia", cancha.getProvincia());
		model.addAttribute("nombre", cancha.getLocalidad());
		model.addAttribute("nombre", cancha.getNumero());
		model.addAttribute("nombre", cancha.getCanchasDisponibles());
		
	}
	
	public List<Cancha>listarCanchas(){
		
		List<Cancha>canchas=new LinkedList<Cancha>();
		Cancha cancha1 = new Cancha();
		Cancha cancha2 = new Cancha();
		Cancha cancha3 = new Cancha();
		Cancha cancha4 = new Cancha();
		
		cancha1.setCalle("montt");
		cancha1.setCanchasDisponibles(5);
		cancha1.setLocalidad("Castillo");
		cancha1.setNombre("Soccer");
		cancha1.setNumero(551);
		cancha1.setProvincia("Buenos Aires");
		
		cancha2.setCalle("montt");
		cancha2.setCanchasDisponibles(5);
		cancha2.setLocalidad("Castillo");
		cancha2.setNombre("Soccer");
		cancha2.setNumero(551);
		cancha2.setProvincia("Buenos Aires");
		canchas.add(cancha1);
		canchas.add(cancha2);
		return canchas;
	}
	

}
