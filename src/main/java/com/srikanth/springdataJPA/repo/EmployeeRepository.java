package com.srikanth.springdataJPA.repo;

import org.springframework.data.repository.CrudRepository;

import com.srikanth.springdataJPA.pojo.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,String>{

}
