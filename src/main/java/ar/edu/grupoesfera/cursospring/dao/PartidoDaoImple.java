package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.modelo.Cancha;
import ar.edu.grupoesfera.cursospring.modelo.Partido;

@Service
public class PartidoDaoImple implements PartidoDao {
	
	@Inject
	private SessionFactory sessionFactory;
   
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
	public void insertarPartido(Partido partido){
    	final Session session = sessionFactory.getCurrentSession();
    	session.save(partido);
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
    public List<Partido> getPartidos(){
    	final Session session = sessionFactory.getCurrentSession();
    	List<Partido> lista = session.createCriteria(Partido.class).add(Restrictions.eq("estado","Pendiente")).list();
    	return lista;
    	}

	
	

}
