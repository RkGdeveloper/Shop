package com.cg.emplm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.emplm.dao.EmplRepository;
import com.cg.emplm.dtos.Employee;

@Service
public class EmplServiceImpl implements EmplService {

	@Autowired
	private EmplRepository empRepository;
	public EmplRepository getEmpRepository() {
		return empRepository;
	}
	public void setEmpRepository(EmplRepository empRepository) {
		this.empRepository = empRepository;
	}
	@Override
	public List<Employee> getAllItems() {
		return empRepository.getAllItems();
	}
}
