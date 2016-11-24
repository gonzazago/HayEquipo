package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.modelo.Cancha;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;
@Service
public class CanchaDaoImple implements CanchaDao{
	@Inject
	private SessionFactory sessionFactory;
   
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
	public void insertarCancha(Cancha cancha){
    	final Session session = sessionFactory.getCurrentSession();
    	session.save(cancha);
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
    public List<Cancha> getCanchas(){
    	final Session session = sessionFactory.getCurrentSession();
    	List<Cancha> lista = session.createCriteria(Cancha.class).list();
    	return lista;
    }
    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
    public List<Cancha>getCanchasPorLocalidad(String localidad){
    	final Session session = sessionFactory.getCurrentSession();
    	List<Cancha> lista = session.createCriteria(Cancha.class)
    								.add(Restrictions.eq("localidad",localidad)).list();
    	return lista;
    }
}
