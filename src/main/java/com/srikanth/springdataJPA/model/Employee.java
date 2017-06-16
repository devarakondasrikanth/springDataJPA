package com.srikanth.springdataJPA.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	@Id	
	private String id;
	private String name;
	private String emailId;
	private String mobileNumber;	
	@ManyToOne
	private Department dep;	
	
	public Employee(String id, String name, String emailId, String mobileNumber,String depId) {
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.dep = new Department("depId","");
	}
	public Employee() {
	
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public Department getDep() {
		return dep;
	}
	public void setDep(Department dep) {
		this.dep = dep;
	}
	
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", emailId=" + emailId + ", mobileNumber=" + mobileNumber
				+ "]";
	}
}
