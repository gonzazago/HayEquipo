package ar.edu.grupoesfera.cursospring.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.junit.Test;

import ar.edu.grupoesfera.cursospring.controladores.ControladorPartido;
import ar.edu.grupoesfera.cursospring.modelo.Partido;
import ar.edu.grupoesfera.cursospring.servicios.PartidosServicios;

public class ControladorPartidoTest {

	@Test
	public void quePartidoCreadoRetorneALaVistaDelPerfil() {
		ControladorPartido controlador = new ControladorPartido();
		Partido partidoTest = new Partido();
		HttpServletRequest requestMock = mock(HttpServletRequest.class);
		HttpSession httpMock = mock(HttpSession.class);
		PartidosServicios serviciosMock = mock(PartidosServicios.class);		
		when(requestMock.getSession()).thenReturn(httpMock);
		when(httpMock.getAttribute("idUsuario")).thenReturn((long)1);
		controlador.setPartidosServicios(serviciosMock);
		String map = controlador.partidoCreado(partidoTest, requestMock);		
		assertThat(map).isEqualTo("redirect:/perfil");
	}

}
