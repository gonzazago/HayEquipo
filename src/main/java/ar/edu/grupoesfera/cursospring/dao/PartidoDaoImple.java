package ar.edu.grupoesfera.cursospring.dao;

import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.modelo.Cancha;
import ar.edu.grupoesfera.cursospring.modelo.Partido;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;

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
	public void insertarJugador(Partido partido){
    	final Session session = sessionFactory.getCurrentSession();
    	session.save(partido);
    }
    

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
    public List<Partido> getPartidos(){
    	final Session session = sessionFactory.getCurrentSession();
    	List<Partido> lista = session.createCriteria(Partido.class)
    							.setFetchMode("jugadores_partidos",FetchMode.JOIN)
    							.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
    							.list();
    	return lista;
    	}
    

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
    public Partido getPartidosPorId(Long idPartido){
    	final Session session = sessionFactory.getCurrentSession();
    	Partido partido = new Partido();
    	
    	List<Partido> lista = session.createCriteria(Partido.class)
    							.add(Restrictions.eq("idPartido",idPartido)).list();
    							
    	
    	
    	for(Iterator i = lista.iterator(); i.hasNext();){
    		partido = (Partido) i.next();
      	}
    	return partido;
    	
    }
    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
    public List<Partido> partidosHistorial(String fecha){
    	final Session session = sessionFactory.getCurrentSession();
    	List<Partido> lista = session.createCriteria(Partido.class)
    							.add(Restrictions.lt("fechaPartido",fecha)).list();
    	return lista;
    	}

}
