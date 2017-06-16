package com.srikanth.springdataJPA.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srikanth.springdataJPA.model.Employee;
import com.srikanth.springdataJPA.repo.EmployeeRepository;
@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	public List<Employee> getAllEmployees(){
		List<Employee> employeelist = new ArrayList<>();
		employeeRepo.findAll().forEach(employeelist::add);
		return employeelist;
	}
	
	public void addEmployee(Employee emp){
		employeeRepo.save(emp);
	}
}
