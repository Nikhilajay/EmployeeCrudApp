package com.test.employeeCrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	@Id
	@Column
	int id;
	  	  	  
	@Column
	String name;
	@Column
	String dept;

	@Column
	String city;
	
	@Column
	Long contactInfo;
	public String getCity() {
		return city;
	}

	public Employee(int id, String name, String dept, String city, Long contactInfo) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.city = city;
		this.contactInfo = contactInfo;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(Long contactInfo) {
		this.contactInfo = contactInfo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
