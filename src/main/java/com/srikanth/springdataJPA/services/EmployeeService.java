package com.srikanth.springdataJPA.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.srikanth.springdataJPA.pojo.Employee;
import com.srikanth.springdataJPA.repo.EmployeeRepository;

public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	public List<Employee> getAllEmployees(){
		List<Employee> employeelist = new ArrayList<>();
		employeeRepo.findAll().forEach(employeelist::add);
		return employeelist;
	}

}
