package com.srikanth.springdataJPA.pojo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Corporate {
	@Id
	private String id;
	private String name;
	private List<Employee> emp;
	private List<Department> dept;
	
	public Corporate(String id, String name, List<Employee> emp, List<Department> dept) {
		super();
		this.id = id;
		this.name = name;
		this.emp = emp;
		this.dept = dept;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Employee> getEmp() {
		return emp;
	}
	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	public List<Department> getDept() {
		return dept;
	}
	public void setDept(List<Department> dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Corporate [id=" + id + ", name=" + name + ", emp=" + emp + ", dept=" + dept + "]";
	}
	
}
