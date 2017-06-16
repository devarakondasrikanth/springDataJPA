package com.srikanth.springdataJPA.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService depService;
	
	@RequestMapping("/department")
	public List<Department> getall(){
		return depService.getAllDepartments();
	}
	
	@RequestMapping("/department/{id}")
	public Department getDepartment(@PathVariable String id){
		return depService.getDep(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/department")
	public void addDepartment(@RequestBody Department dep){
		depService.addDep(dep);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/department/{id}")
	public void updateDepartment(@RequestBody Department dep,@PathVariable String id){
		depService.updateDepartment(dep, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/department/{id}")
	public void deleteDepartment(@PathVariable String id){
		depService.deleteDepartment(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/departments")
	public void addDepartments(@RequestBody List<Department> dep){
		dep.forEach(depService::addDep);
	}
	
}
