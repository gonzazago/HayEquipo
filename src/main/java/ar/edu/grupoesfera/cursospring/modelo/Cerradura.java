package ar.edu.grupoesfera.cursospring.modelo;

public class Cerradura {

	private Integer clave;
	private Integer CantidadErrores;
	private Integer Errores = 0;
	
	public Cerradura(Integer clave, Integer CantidadErrores) {
		this.clave = clave;
		this.CantidadErrores = CantidadErrores;
	}

	public Boolean abrirCerradura(Integer claveRecibida){
	
		if(clave.equals(claveRecibida)){
			Errores = 0;
			return true;
		}
		else
			Errores+=1;
			return false;
		
			
	}
	
	public Boolean estaBloqueada(){
		
		if(Errores.equals(CantidadErrores))
			return true;
		else 
			return false;
	}
	
	
	
	
	
	
}
