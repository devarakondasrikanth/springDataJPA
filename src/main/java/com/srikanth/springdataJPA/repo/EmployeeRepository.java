package com.srikanth.springdataJPA.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.srikanth.springdataJPA.model.Employee;
@Service
public interface EmployeeRepository extends CrudRepository<Employee,String>{
		
		public List<Employee> findByDeptId(String depId);
		
		
}
