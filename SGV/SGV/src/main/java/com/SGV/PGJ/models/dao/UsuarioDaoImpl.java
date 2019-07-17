package com.SGV.PGJ.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.SGV.PGJ.models.usuarios;

@Repository
public class UsuarioDaoImpl implements IUsuarioDao {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	@Override
	public List<usuarios> finAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from usuarios").getResultList();
	}
	

}































