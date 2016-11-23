package ar.edu.grupoesfera.cursospring.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.controladores.ControladorInicio;

public class ControladorInicioTest {

	@Test
	public void unirseAPartidoConUsuarioLogueado() {
		ControladorInicio controlador = new ControladorInicio();		
		HttpServletRequest requestMock = mock(HttpServletRequest.class);
		ModelMap modelMock = mock(ModelMap.class);
		HttpSession httpMock = mock(HttpSession.class);
		
		httpMock.setAttribute("idUsuario", 1);
		httpMock.setAttribute("usuario", null);
		
		when(requestMock.getSession()).thenReturn(httpMock);
		when(httpMock.getAttribute("idUsuario")).thenReturn((long)1);
		when(httpMock.getAttribute("usuario")).thenReturn(null);
		
		String map = controlador.unirsePartido(anyLong(), modelMock, requestMock);
		
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
}
