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
	
	public Employee getEmployee(String empId){
		return employeeRepo.findOne(empId);
	}
	
	public List<Employee> getAllEmployeesInDepartment(String deptId){
		return employeeRepo.findByDeptId(deptId);
	}
	
	public List<Employee> getAllEmpoyeesByMobileNumber(String mobileNumber){
		return employeeRepo.findByMobileNumber(mobileNumber);
	}
}
