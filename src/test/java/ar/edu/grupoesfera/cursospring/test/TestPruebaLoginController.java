package ar.edu.grupoesfera.cursospring.controladores;

import javax.servlet.http.HttpServletRequest;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import static org.assertj.core.api.Assertions.*; //assertThat
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import ar.edu.grupoesfera.cursospring.modelo.UsuarioParaPruebaTest;
import ar.edu.grupoesfera.cursospring.servicios.PersonaService;

public class TestPruebaLoginController
{

	@Test
	public void loginConUsuarioYPasswordIncorrectoDeberiaVolverAlLoginNuevamente()
	{
		PruebaLoginController controlador = new PruebaLoginController();
		UsuarioParaPruebaTest usuario = new UsuarioParaPruebaTest();
		usuario.setUsuario("usuario");
		usuario.setPassword("1234");
		usuario.setRol("Admin");
		HttpServletRequest requestMock = mock(HttpServletRequest.class);
		PersonaService personaServiceMock = mock(PersonaService.class);
		when(personaServiceMock.validarUsuario(anyString(), anyString())).thenReturn(null);
		
		controlador.setPersonaService(personaServiceMock);
		ModelAndView map = controlador.login(usuario, requestMock);
		assertThat(map.getModel().get("error")).isEqualTo("usuaio-invalido");
		assertThat(map.getViewName()).isEqualTo("login");
	}
	
	/*@Test
	public void loginConUsuarioYPasswordCorrectoDebeIrALaHome()
	{
		PruebaLoginController controlador = new PruebaLoginController();
		UsuarioParaPruebaTest usuario = new UsuarioParaPruebaTest();
		
		HttpServletRequest requestMock = mock(HttpServletRequest.class);
		PersonaService personaServiceMock = mock(PersonaService.class);
		UsuarioParaPruebaTest usuarioMock = mock(UsuarioParaPruebaTest.class);
		usuario.setUsuario("usuario");
		usuario.setPassword("1234");
		usuario.setRol("ROL");
		when(usuarioMock.getUsuario()).thenReturn("usuario");
		when(usuarioMock.getPassword()).thenReturn("1234");
		when(usuarioMock.getRol()).thenReturn("ROL");
		when(personaServiceMock.validarUsuario(usuarioMock.getUsuario(),usuarioMock.getPassword())).thenReturn(usuarioMock);
		controlador.setPersonaService(personaServiceMock);
		ModelAndView map = controlador.login(usuario, requestMock);
		assertThat(map.getViewName()).isEqualTo("home");
		
	}*/

}
