package ar.edu.grupoesfera.cursospring.dao;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;

@Service("insertarUsuario")
@Transactional
public class InsertarUsuario {
	@Inject
	private SessionFactory sessionFactory;
	
    @PostConstruct
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
    public void cargarUsuario(Usuario user){
    	final Session session = sessionFactory.getCurrentSession();
    	session.save(user);
    }
	

}
