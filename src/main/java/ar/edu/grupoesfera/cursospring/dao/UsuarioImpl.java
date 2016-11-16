package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.modelo.Loggin;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;

@Service("UsuarioDao")
/*@Transactional*/
public class UsuarioImpl implements UsuarioDao{
	@Inject
	private SessionFactory sessionFactory;
	
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
    public void cargarUsuario(Usuario user){
    	final Session session = sessionFactory.getCurrentSession();
    	session.save(user);
    }
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
    public List<Usuario> recuperarUsuario(Loggin user){
    	final Session session = sessionFactory.getCurrentSession();
    	String usuario = user.getUsuario();
    	String password = user.getPassword();
    	List<Usuario> userLoggin = session.createCriteria(Usuario.class)
    			.add(Restrictions.eq("nomUsuario",usuario))
    			.add(Restrictions.eq("password",password)).list();
    	return userLoggin;
    			
    	
    }
	

}
