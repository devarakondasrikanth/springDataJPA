package com.srikanth.springdataJPA.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository depRep;
	
	public void addDep(Department dep){
		depRep.save(dep);
	}
	
	public Department getDep(String id){
		return depRep.findOne(id);
	}
	
	public List<Department> getAllDepartments(){
		List<Department> deplist = new ArrayList<>();
		depRep.findAll().forEach(deplist::add);
		return deplist;
	}
	
	public void updateDepartment(Department dep,String id){
		depRep.save(dep);
	}
	
	public void deleteDepartment(String id){
		depRep.delete(id);
	}
}
