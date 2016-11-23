package ar.edu.grupoesfera.cursospring.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.servlet.http.HttpServletRequest;

import org.junit.Test;
import org.springframework.ui.ModelMap;

import ar.edu.grupoesfera.cursospring.controladores.ControladorInicio;

public class ControladorInicioTest {

	@Test
	public void unirseAPartidoConUsuarioLogueado() {
		ControladorInicio controlador = new ControladorInicio();		
		HttpServletRequest requestMock = mock(HttpServletRequest.class);
		ModelMap modelMock = mock(ModelMap.class);
		
		when(requestMock.getSession().getAttribute("usuario")).thenReturn(null);
		
		String map = controlador.unirsePartido(anyLong(), modelMock, requestMock);
		
		assertThat(map).isEqualTo("redirect:/iniciarSesion");
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
