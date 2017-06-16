package com.srikanth.springdataJPA.repo;

import org.springframework.data.repository.CrudRepository;
import com.srikanth.springdataJPA.model.Department;

public interface DepartmentRepository extends CrudRepository<Department,String>{

}
