package com.srikanth.springdataJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.srikanth.springdataJPA.model.Department;
import com.srikanth.springdataJPA.model.Employee;
import com.srikanth.springdataJPA.service.EmployeeService;


@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/employee")
	public List<Employee> employees(){		
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/department/{departmentid}/employee")
	public void addEmployee(@RequestBody Employee emp, @PathVariable String departmentid){
		emp.setDep(new Department(departmentid,""));
		employeeService.addEmployee(emp);
	}
	
	@RequestMapping(value="/department/{departmentid}/employees")
	public List<Employee> getEmployeesByDepartmentID(@PathVariable String departmentid){
		return employeeService.getAllEmployeesInDepartment(departmentid);
	}
	
	@RequestMapping(value="/employees/{mobileNumber}")
	public List<Employee> getEmployeesByMobileNumber(@PathVariable String mobileNumber){
		return employeeService.getAllEmpoyeesByMobileNumber(mobileNumber);
	}
}
