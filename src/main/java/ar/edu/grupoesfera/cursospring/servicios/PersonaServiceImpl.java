package ar.edu.grupoesfera.cursospring.servicios;

import org.springframework.stereotype.Service;

import ar.edu.grupoesfera.cursospring.modelo.UsuarioParaPruebaTest;


@Service
public class PersonaServiceImpl implements PersonaService
{
	public UsuarioParaPruebaTest validarUsuario(String usuario, String password)
	{
		return  new UsuarioParaPruebaTest();
	}

}
