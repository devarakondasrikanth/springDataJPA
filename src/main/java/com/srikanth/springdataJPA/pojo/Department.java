package com.srikanth.springdataJPA.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	private String id;
	private String depName;
	
	public Department(String id, String depName) {
		super();
		this.id = id;
		this.depName = depName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", depName=" + depName + "]";
	}
	
}
