package com.srikanth.springdataJPA.repo;

import org.springframework.data.repository.CrudRepository;

import com.srikanth.springdataJPA.pojo.Department;

public interface DepartmentRepository extends CrudRepository<Department,String>{

}
