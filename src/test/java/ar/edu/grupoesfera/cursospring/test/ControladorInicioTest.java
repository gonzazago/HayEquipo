package ar.edu.grupoesfera.cursospring.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.controladores.ControladorInicio;
import ar.edu.grupoesfera.cursospring.modelo.Cancha;
import ar.edu.grupoesfera.cursospring.servicios.CanchasServicios;

public class ControladorInicioTest {

	@Test
	public void unirseAPartidoConUsuarioLogueado() {
		ControladorInicio controlador = new ControladorInicio();		
		HttpServletRequest requestMock = mock(HttpServletRequest.class);
		ModelMap modelMock = mock(ModelMap.class);
		HttpSession httpMock = mock(HttpSession.class);
		
		when(requestMock.getSession()).thenReturn(httpMock);
		when(httpMock.getAttribute("idUsuario")).thenReturn((long)1);
		when(httpMock.getAttribute("usuario")).thenReturn(null);
		
		String map = controlador.unirsePartido(2L, modelMock, requestMock);		
		
		assertThat(map).isEqualTo("redirect:/iniciarSesion");
	}

	@Test
	public void iniciarSesionRetorneVistaLoggin(){
		ControladorInicio controlador = new ControladorInicio();
		ModelMap modelMock = mock(ModelMap.class);			
		
		ModelAndView map = controlador.iniciarSesion(modelMock);
		
		assertThat(map.getViewName()).isEqualTo("loggin");
	}
	
	@Test
	public void registrarUsuario(){
		ControladorInicio controlador = new ControladorInicio();
		ModelMap modelMock = mock(ModelMap.class);			
		
		ModelAndView map = controlador.registroUsuario(modelMock);
		
		assertThat(map.getViewName()).isEqualTo("registrarse");
	}
	
	@Test
	public void buscarCanchaRetorneVistaBusquedad(){
		ControladorInicio controlador = new ControladorInicio();
		CanchasServicios canchasMock = mock(CanchasServicios.class);
		
		List<Cancha> listCanchasTest = new ArrayList<Cancha>();
		
		Cancha canchaTest = new Cancha();
		canchaTest.setIdCancha((long)1);
		canchaTest.setNombre("nomTest");
		canchaTest.setProvincia("provTest");
		canchaTest.setLocalidad("locTest");
		canchaTest.setCalle("calleTest");
		canchaTest.setNumero(1);
		canchaTest.setCanchasDisponibles(1);
		
		listCanchasTest.add(canchaTest);
		
		when(canchasMock.buscarCanchas("")).thenReturn(listCanchasTest);
		controlador.setCanchasServicios(canchasMock);
		
		ModelAndView map = controlador.buscarCancha("");
		
		assertThat(map.getViewName()).isEqualTo("busquedad");
	}
}
