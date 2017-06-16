package com.srikanth.springdataJPA.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.srikanth.springdataJPA.model.Department;
@Service
public interface DepartmentRepository extends CrudRepository<Department,String>{

}
