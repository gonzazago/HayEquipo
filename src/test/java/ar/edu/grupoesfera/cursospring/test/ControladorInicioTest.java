package ar.edu.grupoesfera.cursospring.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.servlet.http.HttpServletRequest;

import org.junit.Test;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.controladores.ControladorInicio;
import ar.edu.grupoesfera.cursospring.modelo.Loggin;
import ar.edu.grupoesfera.cursospring.servicios.VerificarUsuario;

public class ControladorInicioTest {

	@Test
	public void unirseAPartidoConUsuarioLogueado() {
		ControladorInicio controlador = new ControladorInicio();		
		HttpServletRequest requestMock = mock(HttpServletRequest.class);
		Loggin logginMock = mock(Loggin.class);
		ModelMap modelMock = mock(ModelMap.class);
		
		when(requestMock.getSession().getAttribute("usuario")).thenReturn(null);
		
		ModelAndView map = controlador.unirsePartido(anyLong(), modelMock, requestMock, logginMock);
		
		assertThat(map.getViewName()).isEqualTo("loggin");
	}
	
	/*@Test
	public void unirseAPartidoSinUsuario() {
		ControladorInicio controlador = new ControladorInicio();
		VerificarUsuario verificarUsuarioMock = mock(VerificarUsuario.class);
		HttpServletRequest requestMock = mock(HttpServletRequest.class);
		
		//when(verificarUsuarioMock.verificarUsuarioLogeado(new Loggin(), requestMock)).thenReturn(false);
		
		ModelAndView map = controlador.unirsePartido((long) 10, new ModelMap(), requestMock, new Loggin());
		
		assertThat(map.getViewName()).isEqualTo("loggin");
	}*/

}
