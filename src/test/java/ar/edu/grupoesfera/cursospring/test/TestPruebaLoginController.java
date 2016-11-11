package ar.edu.grupoesfera.cursospring.test;

//assertThat
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.controladores.PruebaLoginController;
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
	
	@Test
	public void loginConUsuarioYPasswordCorrectoDebeIrALaHome()
	{
		PruebaLoginController controlador = new PruebaLoginController();
		UsuarioParaPruebaTest usuario = new UsuarioParaPruebaTest();
		usuario.setUsuario("usuario");
		usuario.setPassword("1234");
		usuario.setRol("ROL");
		HttpServletRequest requestMock = mock(HttpServletRequest.class);
		PersonaService personaServiceMock = mock(PersonaService.class);
		HttpSession httpMock = mock(HttpSession.class);
		//UsuarioParaPruebaTest usuarioMock = mock(UsuarioParaPruebaTest.class);
		/*when(usuarioMock.getUsuario()).thenReturn("usuario");
		when(usuarioMock.getPassword()).thenReturn("1234");
		when(usuarioMock.getRol()).thenReturn("ROL");*/
		when(personaServiceMock.validarUsuario(anyString(),anyString())).thenReturn(usuario);
		when(requestMock.getSession()).thenReturn(httpMock);
		controlador.setPersonaService(personaServiceMock);
		ModelAndView map = controlador.login(usuario, requestMock);
		assertThat(map.getViewName()).isEqualTo("home");		
	}

}
