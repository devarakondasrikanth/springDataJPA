package com.srikanth.springdataJPA.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


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
}
