package com.cg.emplm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




import org.springframework.web.servlet.ModelAndView;

import com.cg.emplm.dao.EmplRepository;
import com.cg.emplm.dtos.Employee;
@Controller
public class MyController {

	
	@Autowired
	private EmplRepository emplService;


	public EmplRepository getEmplService() {
		return emplService;
	}


	public void setEmplService(EmplRepository emplService) {
		this.emplService = emplService;
	}


	@RequestMapping("/list")
	public ModelAndView getAll(){
		
	List<Employee> empList = emplService.getAllItems();
		
	for(Employee emp : empList){
		System.out.println(emp);
	}
	
		return new ModelAndView("pages/AllItems","eList",empList);
	}
	
}
