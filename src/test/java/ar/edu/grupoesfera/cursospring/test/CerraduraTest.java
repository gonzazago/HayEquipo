package ar.edu.grupoesfera.cursospring.test;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.grupoesfera.cursospring.modelo.Cerradura;

public class CerraduraTest {
	
	@Test
	public void ingresarClaveCorrectaDeberiaAbrirLaCerradura(){
		Cerradura nuevaCerradura = new Cerradura(1234,1);
		Boolean abrio = nuevaCerradura.abrirCerradura(1234);
		Assert.assertTrue(abrio);
	}
	
	@Test
	public void ingresarClaveIncorrectaNodeberiaAbrirLaCerradura(){
		Cerradura nuevaCerradura = new Cerradura(1234,1);
		Boolean abrio = nuevaCerradura.abrirCerradura(2234);
		Assert.assertFalse(abrio);
		
	}

	@Test
	public void ingresarMasDeNVecesCodigoIncorrectoDeberiaBloquearLaCerradura(){
		Cerradura nuevaCerradura = new Cerradura(1234,2);
			nuevaCerradura.abrirCerradura(2234);
			nuevaCerradura.abrirCerradura(2234);
		Boolean estaBloqueada=nuevaCerradura.estaBloqueada();
		Assert.assertTrue(estaBloqueada);
		
	}
}
