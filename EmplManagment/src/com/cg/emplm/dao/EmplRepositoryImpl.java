package com.cg.emplm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.emplm.dtos.Employee;

@Repository
@Transactional
public class EmplRepositoryImpl implements EmplRepository {

	@PersistenceContext
	private EntityManager entityManager;


	@Override
	public List<Employee> getAllItems() {		
		TypedQuery<Employee> query = entityManager.createQuery("SELECT emp FROM Employee emp", Employee.class);
		return query.getResultList();
	}

	
}
