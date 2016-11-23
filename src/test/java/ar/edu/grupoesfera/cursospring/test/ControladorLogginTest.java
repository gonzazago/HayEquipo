package ar.edu.grupoesfera.cursospring.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.servlet.http.HttpServletRequest;

import org.junit.Test;
import org.springframework.ui.ModelMap;

import ar.edu.grupoesfera.cursospring.controladores.ControladorLoggin;
import ar.edu.grupoesfera.cursospring.modelo.Loggin;
import ar.edu.grupoesfera.cursospring.servicios.UsuarioLoggin;

public class ControladorLogginTest {

	@Test
	public void validarUsuarioConUsuarioNoExistente() {
		ControladorLoggin controlador = new ControladorLoggin();
		HttpServletRequest requestMock = mock(HttpServletRequest.class);		
		UsuarioLoggin usuarioLogginMock = mock(UsuarioLoggin.class);
		Loggin logginMock = mock(Loggin.class);
		ModelMap modelMapMock = mock(ModelMap.class);
		
		when(usuarioLogginMock.verficarUsuario(logginMock)).thenReturn(false);
		controlador.setUsuarioLoggin(usuarioLogginMock);		
		String map = controlador.validarUsuario(logginMock, modelMapMock, requestMock);		
		assertThat(map).isEqualTo("redirect:/iniciarSesion");
	}
}
